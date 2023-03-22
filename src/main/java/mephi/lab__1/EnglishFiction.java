package mephi.lab__1;

import java.util.Random;

public class EnglishFiction implements Fiction{
    private String type;
    private String name;
    public EnglishFiction()
    {
        Random random = new Random();
        type = ExcelProvider.getF_eng_types().get(random.nextInt(ExcelProvider.getF_eng_types().size()));
        name = type + ": \"";
        switch (random.nextInt(2, 4)) {
            case 3:
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                name += ", ";
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                name += " and ";
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                break;
            default:
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                name += " and ";
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                break;
        }
        name += "\"";
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
}