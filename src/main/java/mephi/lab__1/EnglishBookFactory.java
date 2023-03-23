package mephi.lab__1;

public class EnglishBookFactory implements BookFactory{

    @Override
    public Textbook createTextbook() {
        return new EnglishTextbook();
    }

    @Override
    public Fiction createFiction() {
        Director director = new Director();
        FictionBuilder fictionBuilder = new EnglishFictionBuilder();
        director.setFictionBuilder(fictionBuilder);
        director.constructFiction();
        return director.getFiction();
    }    
}
