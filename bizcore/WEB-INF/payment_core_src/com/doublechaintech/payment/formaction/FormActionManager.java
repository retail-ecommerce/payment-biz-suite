
package com.doublechaintech.payment.formaction;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface FormActionManager{

		

	public FormAction createFormAction(PaymentUserContext userContext, String label, String localeKey, String actionKey, String level, String url, String formId) throws Exception;	
	public FormAction updateFormAction(PaymentUserContext userContext,String formActionId, int formActionVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public FormAction loadFormAction(PaymentUserContext userContext, String formActionId, String [] tokensExpr) throws Exception;
	public FormAction internalSaveFormAction(PaymentUserContext userContext, FormAction formAction) throws Exception;
	public FormAction internalSaveFormAction(PaymentUserContext userContext, FormAction formAction,Map<String,Object>option) throws Exception;
	
	public FormAction transferToAnotherForm(PaymentUserContext userContext, String formActionId, String anotherFormId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String formActionId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, FormAction newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}














