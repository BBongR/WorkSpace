package com.testapp02.model;

public class ModelUser {

	private String user_no = null; // user_no` INT(11) NOT NULL AUTO_INCREMENT,
	private String user_email = null; // `user_email` VARCHAR(20) NOT NULL,
	private String user_password = null; // `user_password` VARCHAR(20) NOT NULL,
	private String user_user_name = null; // `user_name` VARCHAR(20) NOT NULL,
	private String user_nickname = null; // `user_nickname` VARCHAR(20) NOT NULL,
	private String user_phone = null; // `user_phone` VARCHAR(20) NOT NULL,
	private String user_use = null; // `user_use` TINYINT(1) NOT NULL DEFAULT '1',

	public String getUser_no() {
		return user_no;
	}

	public void setUser_no(String user_no) {
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

	public String getUser_user_name() {
		return user_user_name;
	}

	public void setUser_user_name(String user_user_name) {
		this.user_user_name = user_user_name;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_use() {
		return user_use;
	}

	public void setUser_use(String user_use) {
		this.user_use = user_use;
	}

	@Override
	public String toString() {
		return "ModelUser [user_no=" + user_no + ", user_email=" + user_email + ", user_password=" + user_password
				+ ", user_user_name=" + user_user_name + ", user_nickname=" + user_nickname + ", user_phone="
				+ user_phone + ", user_use=" + user_use + "]";
	}

	public ModelUser(String user_no, String user_email, String user_password, String user_user_name,
			String user_nickname, String user_phone, String user_use) {
		super();
		this.user_no = user_no;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_user_name = user_user_name;
		this.user_nickname = user_nickname;
		this.user_phone = user_phone;
		this.user_use = user_use;
	}

	public ModelUser() {
		super();
	}

}
