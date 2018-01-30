package com.exam09.wonjun.model;

public class ModelPhone {

	private Integer no;          // no` INT(11) NOT NULL AUTO_INCREMENT,
	private String name;         // name` VARCHAR(50) NOT NULL,
	private String manufacturer; // manufacturer` VARCHAR(30) NOT NULL,
	private Integer price;       // price` INT(11) NOT NULL,

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

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

	public ModelPhone(Integer no, String name, String manufacturer, Integer price) {
		super();
		this.no = no;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public ModelPhone() {
		super();
	}

	@Override
	public String toString() {
		return "ModelPhone [no=" + no + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + "]";
	}

}
