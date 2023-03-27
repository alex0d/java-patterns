package practice8.visitor;

import java.util.Arrays;

public class TestVisitor {
    public static void main(String[] args) {
        Visitor visitor = new ElementVisitor();

        Document document = new Document(
                "New Document",
                Arrays.asList(new XmlElement("test.xml"), new JsonElement("test.json"))
        );

        document.accept(visitor);
    }
}
