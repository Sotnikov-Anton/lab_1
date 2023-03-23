package mephi.lab__1;

import java.util.Random;

public class RussianFictionBuilder extends FictionBuilder{

    @Override
    public void buildType() {
        Random random = new Random();
        book.setType(ExcelProvider.getF_rus_types().get(random.nextInt(ExcelProvider.getF_rus_types().size())));
    }

    @Override
    public void buildName() {
        Random random = new Random();
        String name = "";
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
            case 2:
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                name += " и ";
                name += ExcelProvider.getF_rus_names().get(random.nextInt(ExcelProvider.getF_rus_names().size()));
                break;
        }
        name += " (";
        name += book.getType();
        name += ")";
        book.setName(name);
    }
}
