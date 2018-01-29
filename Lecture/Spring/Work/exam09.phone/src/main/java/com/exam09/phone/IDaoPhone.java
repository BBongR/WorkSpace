package com.exam09.phone;

import java.util.List;

public interface IDaoPhone {
	
	List<ModelPhone> getPhoneList();
	int insertPhone(ModelPhone phone);
	
}
