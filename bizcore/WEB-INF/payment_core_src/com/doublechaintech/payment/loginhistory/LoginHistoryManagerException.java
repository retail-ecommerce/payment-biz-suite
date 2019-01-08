
package com.doublechaintech.payment.loginhistory;
//import com.doublechaintech.payment.EntityNotFoundException;
import com.doublechaintech.payment.PaymentException;
import com.doublechaintech.payment.Message;
import java.util.List;

public class LoginHistoryManagerException extends PaymentException {
	private static final long serialVersionUID = 1L;
	public LoginHistoryManagerException(String string) {
		super(string);
	}
	public LoginHistoryManagerException(Message message) {
		super(message);
	}
	public LoginHistoryManagerException(List<Message> messageList) {
		super(messageList);
	}

}


