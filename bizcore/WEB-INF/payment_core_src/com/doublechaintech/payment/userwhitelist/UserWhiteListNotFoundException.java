
package com.doublechaintech.payment.userwhitelist;
import com.doublechaintech.payment.EntityNotFoundException;
public class UserWhiteListNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public UserWhiteListNotFoundException(String string) {
		super(string);
	}

}

