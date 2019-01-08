
package com.doublechaintech.payment.platform;
import com.doublechaintech.payment.EntityNotFoundException;
public class PlatformNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public PlatformNotFoundException(String string) {
		super(string);
	}

}

