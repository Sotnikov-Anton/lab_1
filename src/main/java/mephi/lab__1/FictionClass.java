package mephi.lab__1;

public class FictionClass implements Fiction{
    private String type;
    private String name;
    
    public void setType(String type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType()
    {
        return type;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
}