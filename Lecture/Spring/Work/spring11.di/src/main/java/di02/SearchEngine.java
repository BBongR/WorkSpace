package di02;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine implements ISearchEngine {

    @Override
    public List<Document> findByType(Type documentType) {
        
        List<Document> result = storage();
        
        return result;
    }

    @Override
    public List<Document> listAll() {
        return storage();
    }

    private List<Document> storage() {
        
        List<Document> result = new ArrayList<Document>();
        Type pdfTyp = new Type();
        pdfTyp.setName("PDF");
        pdfTyp.setDesc("Potable Document");
        pdfTyp.setExtension(".pdf");
        
        Type webType = new Type("WEB", "WEB link", ".url");
        
        Document doc1 = new Document();
        doc1.setLocation("/book/Book.pdf");
        doc1.setName("Book");
        doc1.setType(pdfTyp);
        
        result.add(doc1);
        
        Document doc2 = new Document();
        doc2.setLocation("/book/Sample.pdf");
        doc2.setName("Sample");
        doc2.setType(pdfTyp);
        
        result.add(doc1);
        
        
        return result;
    }

}
