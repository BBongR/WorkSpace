package di02.service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di02.Document;
import di02.ISearchEngine;
import di02.Type;

public class TestService {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
        
        Type pdfType = (Type) context.getBean("pdfType");
        assertEquals(pdfType.getName(), "PDF");

        Document doc1 = (Document) context.getBean("doc1", di02.Document.class);
        
        assertEquals(doc1.getType(), pdfType);
        
        Type webType = (Type) context.getBean("webType");
        assertEquals(webType.getName(), "WEB");
        assertEquals(webType.getDesc(), "WEB link");
        assertEquals(webType.getExtension(), ".url");
        
        ISearchEngine engine = context.getBean("engine", ISearchEngine.class);
        assertEquals(2, engine.listAll().size());
    }
}
