
package com.doublechaintech.payment.formaction;
import com.doublechaintech.payment.EntityNotFoundException;

public class FormActionVersionChangedException extends FormActionManagerException {
	private static final long serialVersionUID = 1L;
	public FormActionVersionChangedException(String string) {
		super(string);
	}


}


