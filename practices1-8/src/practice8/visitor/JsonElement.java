package practice8.visitor;

public class JsonElement extends Element {
    public JsonElement(String description) {
        super(description);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}