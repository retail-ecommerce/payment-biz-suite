
package com.doublechaintech.payment;
import java.util.Map;

import com.doublechaintech.payment.platform.Platform;
import com.doublechaintech.payment.userdomain.UserDomain;
import com.doublechaintech.payment.userwhitelist.UserWhiteList;
import com.doublechaintech.payment.secuser.SecUser;
import com.doublechaintech.payment.secuserblocking.SecUserBlocking;
import com.doublechaintech.payment.userapp.UserApp;
import com.doublechaintech.payment.listaccess.ListAccess;
import com.doublechaintech.payment.objectaccess.ObjectAccess;
import com.doublechaintech.payment.loginhistory.LoginHistory;
import com.doublechaintech.payment.genericform.GenericForm;
import com.doublechaintech.payment.formmessage.FormMessage;
import com.doublechaintech.payment.formfieldmessage.FormFieldMessage;
import com.doublechaintech.payment.formfield.FormField;
import com.doublechaintech.payment.formaction.FormAction;

public class BeanFactoryImpl{


	public Platform createPlatform(Map<String,Object> options){
		return new Platform();
	}


	public UserDomain createUserDomain(Map<String,Object> options){
		return new UserDomain();
	}


	public UserWhiteList createUserWhiteList(Map<String,Object> options){
		return new UserWhiteList();
	}


	public SecUser createSecUser(Map<String,Object> options){
		return new SecUser();
	}


	public SecUserBlocking createSecUserBlocking(Map<String,Object> options){
		return new SecUserBlocking();
	}


	public UserApp createUserApp(Map<String,Object> options){
		return new UserApp();
	}


	public ListAccess createListAccess(Map<String,Object> options){
		return new ListAccess();
	}


	public ObjectAccess createObjectAccess(Map<String,Object> options){
		return new ObjectAccess();
	}


	public LoginHistory createLoginHistory(Map<String,Object> options){
		return new LoginHistory();
	}


	public GenericForm createGenericForm(Map<String,Object> options){
		return new GenericForm();
	}


	public FormMessage createFormMessage(Map<String,Object> options){
		return new FormMessage();
	}


	public FormFieldMessage createFormFieldMessage(Map<String,Object> options){
		return new FormFieldMessage();
	}


	public FormField createFormField(Map<String,Object> options){
		return new FormField();
	}


	public FormAction createFormAction(Map<String,Object> options){
		return new FormAction();
	}





}










