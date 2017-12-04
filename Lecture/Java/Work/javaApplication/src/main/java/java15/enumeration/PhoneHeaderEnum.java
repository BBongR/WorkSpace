package java15.enumeration;

public enum PhoneHeaderEnum {
	
	P010("010"),
	P011("011"),
	P016("016"),
	P017("017"),
	P018("018"),
	P019("019");

	private final String value;

	PhoneHeaderEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
