package practice8.visitor;

public abstract class Visitor {
    public abstract void visit(XmlElement xe);
    public abstract void visit(JsonElement je);
}
