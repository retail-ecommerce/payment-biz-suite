
package com.doublechaintech.payment.formfield;
import com.doublechaintech.payment.EntityNotFoundException;

public class FormFieldVersionChangedException extends FormFieldManagerException {
	private static final long serialVersionUID = 1L;
	public FormFieldVersionChangedException(String string) {
		super(string);
	}


}


