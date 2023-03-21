package practice8.visitor;

public class ElementVisitor extends Visitor {
    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing an XML element: " + xe.getDescription());
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println(
                "processing a JSON element: " + je.getDescription());
    }
}