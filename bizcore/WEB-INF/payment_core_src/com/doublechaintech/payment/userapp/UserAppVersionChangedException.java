
package com.doublechaintech.payment.userapp;
import com.doublechaintech.payment.EntityNotFoundException;

public class UserAppVersionChangedException extends UserAppManagerException {
	private static final long serialVersionUID = 1L;
	public UserAppVersionChangedException(String string) {
		super(string);
	}


}


