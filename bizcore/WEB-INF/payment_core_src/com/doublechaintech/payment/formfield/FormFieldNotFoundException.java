
package com.doublechaintech.payment.formfield;
import com.doublechaintech.payment.EntityNotFoundException;
public class FormFieldNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public FormFieldNotFoundException(String string) {
		super(string);
	}

}

