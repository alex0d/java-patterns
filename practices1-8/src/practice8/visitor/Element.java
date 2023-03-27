package practice8.visitor;

public abstract class Element {
    private String description;

    public Element(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void accept(Visitor v);
}
