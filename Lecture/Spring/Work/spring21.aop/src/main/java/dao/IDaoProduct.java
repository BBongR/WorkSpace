package dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.ModelProduct;

public interface IDaoProduct {
    
    ModelProduct getProduct(String name);
    
    ModelProduct getException(String name) throws Exception;
}
