package GoogleDocs.BadDesign;

import java.util.ArrayList;
import java.util.List;

public class Docs {
    private List<String>documentList;
    private String renderedDocument;

    public Docs() {
        documentList = new ArrayList<>();
        renderedDocument = "";
    }

    // Adds text as a plain string
    public void addDocument(String document) {
        documentList.add(document);
    }

    // Adds path to the image
    public vo
}
