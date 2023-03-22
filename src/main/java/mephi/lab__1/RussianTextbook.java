package mephi.lab__1;

import java.util.Random;

public class RussianTextbook implements Textbook{
    private String type;
    private String name;
    public RussianTextbook()
    {
        Random random = new Random();
        type = ExcelProvider.getT_types().get(random.nextInt(ExcelProvider.getT_types().size()));
        name = ExcelProvider.getT_rus_names().get(random.nextInt(ExcelProvider.getT_rus_names().size()));
        name += " (" + type + ")";
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}