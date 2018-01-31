package com.testapp.wonjun.model;

public class ModelUser {

	private Integer user_no       ; // user_no` INT(11) NOT NULL AUTO_INCREMENT,
	private String  user_email    ; // user_email` VARCHAR(20) NOT NULL,
	private String  user_password ; // user_password` VARCHAR(20) NOT NULL,
	private String  user_name     ; // user_name` VARCHAR(20) NOT NULL,
	private String  user_nickname ; // user_nickname` VARCHAR(20) NOT NULL,
	private Integer user_gender   ; // user_gender` TINYINT(1) NOT NULL,
	private String  user_phone    ; // user_phone` VARCHAR(20) NOT NULL,
	private Integer user_use      ; // user_phone`user_use` TINYINT(1) NOT NULL DEFAULT '1',

	// 개터 & 새터
	public Integer getUser_no() {
		return user_no;
	}

	public void setUser_no(Integer user_no) {
		this.user_no = user_no;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public Integer getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(Integer user_gender) {
		this.user_gender = user_gender;
	}
	
	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	
	public Integer getUser_use() {
		return user_use;
	}

	public void setUser_use(Integer user_use) {
		this.user_use = user_use;
	}

	// 생성자
	public ModelUser() {
		super();
	}
	
	public ModelUser(Integer user_no, String user_email, String user_password, String user_name, String user_nickname,
			Integer user_gender, String user_phone, Integer user_use) {
		super();
		this.user_no = user_no;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_nickname = user_nickname;
		this.user_gender = user_gender;
		this.user_phone = user_phone;
		this.user_use = user_use;
	}
	
	// toString
	@Override
	public String toString() {
		return "ModelUser [user_no=" + user_no + ", user_email=" + user_email + ", user_password=" + user_password
				+ ", user_name=" + user_name + ", user_nickname=" + user_nickname + ", user_gender=" + user_gender
				+ ", user_phone=" + user_phone + ", user_use=" + user_use + "]";
	}	
}
