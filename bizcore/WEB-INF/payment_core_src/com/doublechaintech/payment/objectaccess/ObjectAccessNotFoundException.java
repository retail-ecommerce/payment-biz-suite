
package com.doublechaintech.payment.objectaccess;
import com.doublechaintech.payment.EntityNotFoundException;
public class ObjectAccessNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public ObjectAccessNotFoundException(String string) {
		super(string);
	}

}

