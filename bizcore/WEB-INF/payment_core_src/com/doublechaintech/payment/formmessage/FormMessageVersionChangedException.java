
package com.doublechaintech.payment.formmessage;
import com.doublechaintech.payment.EntityNotFoundException;

public class FormMessageVersionChangedException extends FormMessageManagerException {
	private static final long serialVersionUID = 1L;
	public FormMessageVersionChangedException(String string) {
		super(string);
	}


}


