
package com.doublechaintech.payment.platform;
import com.doublechaintech.payment.EntityNotFoundException;

public class PlatformVersionChangedException extends PlatformManagerException {
	private static final long serialVersionUID = 1L;
	public PlatformVersionChangedException(String string) {
		super(string);
	}


}


