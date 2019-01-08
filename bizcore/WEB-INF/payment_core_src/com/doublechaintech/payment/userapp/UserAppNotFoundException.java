
package com.doublechaintech.payment.userapp;
import com.doublechaintech.payment.EntityNotFoundException;
public class UserAppNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public UserAppNotFoundException(String string) {
		super(string);
	}

}

