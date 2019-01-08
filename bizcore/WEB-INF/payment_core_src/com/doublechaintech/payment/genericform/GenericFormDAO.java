
package com.doublechaintech.payment.genericform;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;
import com.doublechaintech.payment.MultipleAccessKey;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.formfield.FormFieldDAO;
import com.doublechaintech.payment.formfieldmessage.FormFieldMessageDAO;
import com.doublechaintech.payment.formaction.FormActionDAO;
import com.doublechaintech.payment.formmessage.FormMessageDAO;


public interface GenericFormDAO{

	
	public GenericForm load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<GenericForm> genericFormList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public GenericForm present(GenericForm genericForm,Map<String,Object> options) throws Exception;
	public GenericForm clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public GenericForm save(GenericForm genericForm,Map<String,Object> options);
	public SmartList<GenericForm> saveGenericFormList(SmartList<GenericForm> genericFormList,Map<String,Object> options);
	public SmartList<GenericForm> removeGenericFormList(SmartList<GenericForm> genericFormList,Map<String,Object> options);
	public SmartList<GenericForm> findGenericFormWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countGenericFormWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countGenericFormWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String genericFormId, int version) throws Exception;
	public GenericForm disconnectFromAll(String genericFormId, int version) throws Exception;
	public int deleteAll() throws Exception;

	public FormMessageDAO getFormMessageDAO();
		
	public FormFieldMessageDAO getFormFieldMessageDAO();
		
	public FormFieldDAO getFormFieldDAO();
		
	public FormActionDAO getFormActionDAO();
		
	
 	public SmartList<GenericForm> requestCandidateGenericFormForFormMessage(PaymentUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<GenericForm> requestCandidateGenericFormForFormFieldMessage(PaymentUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<GenericForm> requestCandidateGenericFormForFormField(PaymentUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
 	public SmartList<GenericForm> requestCandidateGenericFormForFormAction(PaymentUserContext userContext, String ownerClass, String id, String filterKey, int pageNo, int pageSize) throws Exception;
		
	
	public GenericForm planToRemoveFormMessageList(GenericForm genericForm, String formMessageIds[], Map<String,Object> options)throws Exception;


	public GenericForm planToRemoveFormFieldMessageList(GenericForm genericForm, String formFieldMessageIds[], Map<String,Object> options)throws Exception;


	public GenericForm planToRemoveFormFieldList(GenericForm genericForm, String formFieldIds[], Map<String,Object> options)throws Exception;


	public GenericForm planToRemoveFormActionList(GenericForm genericForm, String formActionIds[], Map<String,Object> options)throws Exception;


	
	public SmartList<GenericForm> queryList(String sql, Object ... parmeters);
}


