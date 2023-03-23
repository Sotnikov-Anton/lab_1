package mephi.lab__1;

public class RussianBookFactory implements BookFactory{

    @Override
    public Textbook createTextbook() {
        return new RussianTextbook();
    }

    @Override
    public Fiction createFiction() {
        Director director = new Director();
        FictionBuilder fictionBuilder = new RussianFictionBuilder();
        director.setFictionBuilder(fictionBuilder);
        director.constructFiction();
        return director.getFiction();
    }
    
}
