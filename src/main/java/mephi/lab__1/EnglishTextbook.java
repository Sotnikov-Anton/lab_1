package mephi.lab__1;

import java.util.Random;

public class EnglishTextbook implements Textbook{
    private char stage;
    private String author;
    private String university;
    private String name;
    public EnglishTextbook()
    {
        Random random = new Random();
        name = ExcelProvider.getT_eng_names().get(random.nextInt(ExcelProvider.getT_eng_names().size()));
        author = ExcelProvider.getAuthors().get(random.nextInt(ExcelProvider.getAuthors().size()));
        university = ExcelProvider.getUniversities().get(random.nextInt(ExcelProvider.getUniversities().size()));
        int s = random.nextInt(2);
        switch (s) {
            case 0:
                stage = 'b';
                break;
            case 1:
                stage = 'm';
                break;
        }
    }
    public char getStage() {
        return stage;
    }
    public String getAuthor() {
        return author;
    }
    public String getUniversity() {
        return university;
    }
    public String getName() {
        return name;
    }
}