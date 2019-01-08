
package com.doublechaintech.payment.formfieldmessage;
//import com.doublechaintech.payment.EntityNotFoundException;
import com.doublechaintech.payment.PaymentException;
import com.doublechaintech.payment.Message;
import java.util.List;

public class FormFieldMessageManagerException extends PaymentException {
	private static final long serialVersionUID = 1L;
	public FormFieldMessageManagerException(String string) {
		super(string);
	}
	public FormFieldMessageManagerException(Message message) {
		super(message);
	}
	public FormFieldMessageManagerException(List<Message> messageList) {
		super(messageList);
	}

}


