package com.doublechaintech.payment;

public interface PaymentUserContext extends UserContext{
    //define the domain specific user model
	String getLocaleKey(String subject);
	void setChecker(PaymentChecker checker);
	PaymentChecker getChecker();
}

