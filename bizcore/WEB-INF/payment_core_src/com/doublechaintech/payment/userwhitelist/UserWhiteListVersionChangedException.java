
package com.doublechaintech.payment.userwhitelist;
import com.doublechaintech.payment.EntityNotFoundException;

public class UserWhiteListVersionChangedException extends UserWhiteListManagerException {
	private static final long serialVersionUID = 1L;
	public UserWhiteListVersionChangedException(String string) {
		super(string);
	}


}


