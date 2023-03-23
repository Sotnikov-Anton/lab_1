package mephi.lab__1;

import java.util.Random;

public class EnglishFictionBuilder extends FictionBuilder{

    @Override
    public void buildType() {
        Random random = new Random();
        book.setType(ExcelProvider.getF_eng_types().get(random.nextInt(ExcelProvider.getF_eng_types().size())));
    }
    
    @Override
    public void buildName() {
        Random random = new Random();
        String name = "";
        switch (random.nextInt(2, 4)) {
            case 3:
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                name += ", ";
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                name += " and ";
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                break;
            case 2:
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                name += " and ";
                name += ExcelProvider.getF_eng_names().get(random.nextInt(ExcelProvider.getF_eng_names().size()));
                break;
        }
        name += " (";
        name += book.getType();
        name += ")";
        book.setName(name);
    }
}
