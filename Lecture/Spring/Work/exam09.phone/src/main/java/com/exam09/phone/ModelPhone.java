package com.exam09.phone;

public class ModelPhone {
	private String name;         // name         VARCHAR(50) NOT NULL
	private String manufacturer; // manufacturer VARCHAR(30) NOT NULL
	private int    price;        // price        INT(11)     NOT NULL
	
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ModelPhone() {
		super();
	}

	public ModelPhone(String name, String manufacturer, int price) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ModelPhone [name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}
}
