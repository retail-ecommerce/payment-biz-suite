
package com.doublechaintech.payment.formmessage;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface FormMessageManager{

		

	public FormMessage createFormMessage(PaymentUserContext userContext, String title, String formId, String level) throws Exception;	
	public FormMessage updateFormMessage(PaymentUserContext userContext,String formMessageId, int formMessageVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public FormMessage loadFormMessage(PaymentUserContext userContext, String formMessageId, String [] tokensExpr) throws Exception;
	public FormMessage internalSaveFormMessage(PaymentUserContext userContext, FormMessage formMessage) throws Exception;
	public FormMessage internalSaveFormMessage(PaymentUserContext userContext, FormMessage formMessage,Map<String,Object>option) throws Exception;
	
	public FormMessage transferToAnotherForm(PaymentUserContext userContext, String formMessageId, String anotherFormId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String formMessageId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, FormMessage newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


