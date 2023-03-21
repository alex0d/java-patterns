package practice8.visitor;

public class XmlElement extends Element {
    public XmlElement(String description) {
        super(description);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
