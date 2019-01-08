
package com.doublechaintech.payment.formfieldmessage;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface FormFieldMessageManager{

		

	public FormFieldMessage createFormFieldMessage(PaymentUserContext userContext, String title, String parameterName, String formId, String level) throws Exception;	
	public FormFieldMessage updateFormFieldMessage(PaymentUserContext userContext,String formFieldMessageId, int formFieldMessageVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public FormFieldMessage loadFormFieldMessage(PaymentUserContext userContext, String formFieldMessageId, String [] tokensExpr) throws Exception;
	public FormFieldMessage internalSaveFormFieldMessage(PaymentUserContext userContext, FormFieldMessage formFieldMessage) throws Exception;
	public FormFieldMessage internalSaveFormFieldMessage(PaymentUserContext userContext, FormFieldMessage formFieldMessage,Map<String,Object>option) throws Exception;
	
	public FormFieldMessage transferToAnotherForm(PaymentUserContext userContext, String formFieldMessageId, String anotherFormId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String formFieldMessageId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, FormFieldMessage newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


