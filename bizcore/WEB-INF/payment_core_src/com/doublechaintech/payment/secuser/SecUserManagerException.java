
package com.doublechaintech.payment.secuser;
//import com.doublechaintech.payment.EntityNotFoundException;
import com.doublechaintech.payment.PaymentException;
import com.doublechaintech.payment.Message;
import java.util.List;

public class SecUserManagerException extends PaymentException {
	private static final long serialVersionUID = 1L;
	public SecUserManagerException(String string) {
		super(string);
	}
	public SecUserManagerException(Message message) {
		super(message);
	}
	public SecUserManagerException(List<Message> messageList) {
		super(messageList);
	}

}


