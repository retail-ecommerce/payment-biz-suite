
package com.doublechaintech.payment.objectaccess;
import com.doublechaintech.payment.EntityNotFoundException;

public class ObjectAccessVersionChangedException extends ObjectAccessManagerException {
	private static final long serialVersionUID = 1L;
	public ObjectAccessVersionChangedException(String string) {
		super(string);
	}


}


