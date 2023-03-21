package practice8.visitor;

import java.util.List;

public class Document extends Element {
    private List<Element> elements;

    public Document(String description, List<Element> elements) {
        super(description);
        this.elements = elements;
    }

    @Override
    public void accept(Visitor v) {
        System.out.println("Start parsing document: " + getDescription());
        for (Element e : this.elements) {
            e.accept(v);
        }
    }
}