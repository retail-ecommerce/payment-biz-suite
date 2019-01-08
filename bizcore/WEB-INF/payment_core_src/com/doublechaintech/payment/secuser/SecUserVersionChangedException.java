
package com.doublechaintech.payment.secuser;
import com.doublechaintech.payment.EntityNotFoundException;

public class SecUserVersionChangedException extends SecUserManagerException {
	private static final long serialVersionUID = 1L;
	public SecUserVersionChangedException(String string) {
		super(string);
	}


}


