
package com.doublechaintech.payment.loginhistory;
import com.doublechaintech.payment.EntityNotFoundException;

public class LoginHistoryVersionChangedException extends LoginHistoryManagerException {
	private static final long serialVersionUID = 1L;
	public LoginHistoryVersionChangedException(String string) {
		super(string);
	}


}


