package com.spring61.rest.model;

public class ModelPhone {
    
    private String  name         = "";
    private String  manufacturer = "";
    private Integer price        = 0;
    
    // 생성자
    public ModelPhone() {
        super();
    }
    
    // getter & setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
        return "ModelPhone [name=" + name + ", manufacturer=" + manufacturer
                + ", price=" + price + "]";
    }
}
