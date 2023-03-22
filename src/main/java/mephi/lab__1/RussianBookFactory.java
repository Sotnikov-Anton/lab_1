package mephi.lab__1;

public class RussianBookFactory implements BookFactory{

    @Override
    public Textbook createTextbook() {
        return new RussianTextbook();
    }

    @Override
    public Fiction createFiction() {
        return new RussianFiction();
    }
    
}
