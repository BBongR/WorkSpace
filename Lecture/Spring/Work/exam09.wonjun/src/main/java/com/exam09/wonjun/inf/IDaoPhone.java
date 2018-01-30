package com.exam09.wonjun.inf;

import java.util.List;

import com.exam09.wonjun.model.ModelPhone;

public interface IDaoPhone {

	List<ModelPhone> getPhoneList();
	
	int insertPhone(ModelPhone phone);
	
}
