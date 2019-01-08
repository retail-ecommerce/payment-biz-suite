
package com.doublechaintech.payment.genericform;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface GenericFormManager{

		

	public GenericForm createGenericForm(PaymentUserContext userContext, String title, String description) throws Exception;	
	public GenericForm updateGenericForm(PaymentUserContext userContext,String genericFormId, int genericFormVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public GenericForm loadGenericForm(PaymentUserContext userContext, String genericFormId, String [] tokensExpr) throws Exception;
	public GenericForm internalSaveGenericForm(PaymentUserContext userContext, GenericForm genericForm) throws Exception;
	public GenericForm internalSaveGenericForm(PaymentUserContext userContext, GenericForm genericForm,Map<String,Object>option) throws Exception;
	


	public void delete(PaymentUserContext userContext, String genericFormId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, GenericForm newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	

	//public  FormMessageManager getFormMessageManager(PaymentUserContext userContext, String genericFormId, String title, String level ,String [] tokensExpr)  throws Exception;
	
	public  GenericForm addFormMessage(PaymentUserContext userContext, String genericFormId, String title, String level , String [] tokensExpr)  throws Exception;
	public  GenericForm removeFormMessage(PaymentUserContext userContext, String genericFormId, String formMessageId, int formMessageVersion,String [] tokensExpr)  throws Exception;
	public  GenericForm updateFormMessage(PaymentUserContext userContext, String genericFormId, String formMessageId, int formMessageVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  FormFieldMessageManager getFormFieldMessageManager(PaymentUserContext userContext, String genericFormId, String title, String parameterName, String level ,String [] tokensExpr)  throws Exception;
	
	public  GenericForm addFormFieldMessage(PaymentUserContext userContext, String genericFormId, String title, String parameterName, String level , String [] tokensExpr)  throws Exception;
	public  GenericForm removeFormFieldMessage(PaymentUserContext userContext, String genericFormId, String formFieldMessageId, int formFieldMessageVersion,String [] tokensExpr)  throws Exception;
	public  GenericForm updateFormFieldMessage(PaymentUserContext userContext, String genericFormId, String formFieldMessageId, int formFieldMessageVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  FormFieldManager getFormFieldManager(PaymentUserContext userContext, String genericFormId, String label, String localeKey, String parameterName, String type, String placeholder, String defaultValue, String description, String fieldGroup, String minimumValue, String maximumValue, boolean required, boolean disabled, boolean customRendering, String candidateValues, String suggestValues ,String [] tokensExpr)  throws Exception;
	
	public  GenericForm addFormField(PaymentUserContext userContext, String genericFormId, String label, String localeKey, String parameterName, String type, String placeholder, String defaultValue, String description, String fieldGroup, String minimumValue, String maximumValue, boolean required, boolean disabled, boolean customRendering, String candidateValues, String suggestValues , String [] tokensExpr)  throws Exception;
	public  GenericForm removeFormField(PaymentUserContext userContext, String genericFormId, String formFieldId, int formFieldVersion,String [] tokensExpr)  throws Exception;
	public  GenericForm updateFormField(PaymentUserContext userContext, String genericFormId, String formFieldId, int formFieldVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  FormActionManager getFormActionManager(PaymentUserContext userContext, String genericFormId, String label, String localeKey, String actionKey, String level, String url ,String [] tokensExpr)  throws Exception;
	
	public  GenericForm addFormAction(PaymentUserContext userContext, String genericFormId, String label, String localeKey, String actionKey, String level, String url , String [] tokensExpr)  throws Exception;
	public  GenericForm removeFormAction(PaymentUserContext userContext, String genericFormId, String formActionId, int formActionVersion,String [] tokensExpr)  throws Exception;
	public  GenericForm updateFormAction(PaymentUserContext userContext, String genericFormId, String formActionId, int formActionVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/



}


