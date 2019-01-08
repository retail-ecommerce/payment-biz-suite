
package com.doublechaintech.payment.userdomain;
import com.doublechaintech.payment.EntityNotFoundException;
public class UserDomainNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public UserDomainNotFoundException(String string) {
		super(string);
	}

}

