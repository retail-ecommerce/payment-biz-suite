
package com.doublechaintech.payment.userdomain;
//import com.doublechaintech.payment.EntityNotFoundException;
import com.doublechaintech.payment.PaymentException;
import com.doublechaintech.payment.Message;
import java.util.List;

public class UserDomainManagerException extends PaymentException {
	private static final long serialVersionUID = 1L;
	public UserDomainManagerException(String string) {
		super(string);
	}
	public UserDomainManagerException(Message message) {
		super(message);
	}
	public UserDomainManagerException(List<Message> messageList) {
		super(messageList);
	}

}


