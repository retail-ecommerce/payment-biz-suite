
package com.doublechaintech.payment;


public class PaymentRuntimeException extends RuntimeException {
    static final long serialVersionUID = -1;

    public PaymentRuntimeException() {
        super();
    }


    public PaymentRuntimeException(String message) {
        super(message);
    }


    public PaymentRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }


    public PaymentRuntimeException(Throwable cause) {
        super(cause);
    }


   
}












