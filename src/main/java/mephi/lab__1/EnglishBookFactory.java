package mephi.lab__1;

public class EnglishBookFactory implements BookFactory{

    @Override
    public Textbook createTextbook() {
        return new EnglishTextbook();
    }

    @Override
    public Fiction createFiction() {
        return new EnglishFiction();
    }    
}
