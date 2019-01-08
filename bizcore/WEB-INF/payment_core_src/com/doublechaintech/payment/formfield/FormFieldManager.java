
package com.doublechaintech.payment.formfield;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface FormFieldManager{

		

	public FormField createFormField(PaymentUserContext userContext, String label, String localeKey, String parameterName, String type, String formId, String placeholder, String defaultValue, String description, String fieldGroup, String minimumValue, String maximumValue, boolean required, boolean disabled, boolean customRendering, String candidateValues, String suggestValues) throws Exception;	
	public FormField updateFormField(PaymentUserContext userContext,String formFieldId, int formFieldVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public FormField loadFormField(PaymentUserContext userContext, String formFieldId, String [] tokensExpr) throws Exception;
	public FormField internalSaveFormField(PaymentUserContext userContext, FormField formField) throws Exception;
	public FormField internalSaveFormField(PaymentUserContext userContext, FormField formField,Map<String,Object>option) throws Exception;
	
	public FormField transferToAnotherForm(PaymentUserContext userContext, String formFieldId, String anotherFormId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String formFieldId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, FormField newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


