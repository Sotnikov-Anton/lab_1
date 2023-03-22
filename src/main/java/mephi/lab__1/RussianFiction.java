package mephi.lab__1;

import java.util.Random;

public class RussianFiction implements Fiction{
    private String type;
    private String name;
    public RussianFiction()
    {
        Random random = new Random();
        type = ExcelProvider.getF_rus_types().get(random.nextInt(ExcelProvider.getF_rus_types().size()));
        name = type + ": \"";
        switch (random.nextInt(2, 5)) {
            case 3:
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += ", ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += " и ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                break;
            case 4:
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += ", ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += ", ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += " и ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                break;
            default:
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += " и ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                break;
        }
        name += "\"";
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
