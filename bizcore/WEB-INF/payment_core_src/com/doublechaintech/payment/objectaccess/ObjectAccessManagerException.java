
package com.doublechaintech.payment.objectaccess;
//import com.doublechaintech.payment.EntityNotFoundException;
import com.doublechaintech.payment.PaymentException;
import com.doublechaintech.payment.Message;
import java.util.List;

public class ObjectAccessManagerException extends PaymentException {
	private static final long serialVersionUID = 1L;
	public ObjectAccessManagerException(String string) {
		super(string);
	}
	public ObjectAccessManagerException(Message message) {
		super(message);
	}
	public ObjectAccessManagerException(List<Message> messageList) {
		super(messageList);
	}

}


