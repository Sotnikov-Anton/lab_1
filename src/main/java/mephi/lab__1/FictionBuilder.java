package mephi.lab__1;

public abstract class FictionBuilder {
    protected FictionClass book;

    public FictionClass getBook() {
        return book;
    }
    public void createNewBook() {book = new FictionClass();}
    public abstract void buildType();
    public abstract void buildName();
}
