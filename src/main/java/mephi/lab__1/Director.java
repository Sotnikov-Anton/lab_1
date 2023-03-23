package mephi.lab__1;

public class Director {
    private FictionBuilder fictionBuilder;

    public void setFictionBuilder(FictionBuilder fb) {
        this.fictionBuilder = fb;
    }
    public FictionClass getFiction() {return fictionBuilder.getBook();}
    public void constructFiction()
    {
        fictionBuilder.createNewBook();
        fictionBuilder.buildType();
        fictionBuilder.buildName();
    }
}