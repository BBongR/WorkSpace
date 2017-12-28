package model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelProduct {
    // SLF4J Logging
    private Logger  logger = LoggerFactory.getLogger(this.getClass());
    private String  name;
    private Integer price;
    
    // getter&setter
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getPrice() {
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    // toString
    @Override
    public String toString() {
        return "ModelProduct [name=" + name + ", price=" + price + "]";
    }
    
    // 생성자
    public ModelProduct() {
        super();
    }
    
    public ModelProduct(String name, Integer price) {
        super();
        this.name = name;
        this.price = price;
    }
}
