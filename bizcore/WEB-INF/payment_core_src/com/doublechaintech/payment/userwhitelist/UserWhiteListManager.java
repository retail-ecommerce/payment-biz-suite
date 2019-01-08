
package com.doublechaintech.payment.userwhitelist;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface UserWhiteListManager{

		

	public UserWhiteList createUserWhiteList(PaymentUserContext userContext, String userIdentity, String userSpecialFunctions, String domainId) throws Exception;	
	public UserWhiteList updateUserWhiteList(PaymentUserContext userContext,String userWhiteListId, int userWhiteListVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public UserWhiteList loadUserWhiteList(PaymentUserContext userContext, String userWhiteListId, String [] tokensExpr) throws Exception;
	public UserWhiteList internalSaveUserWhiteList(PaymentUserContext userContext, UserWhiteList userWhiteList) throws Exception;
	public UserWhiteList internalSaveUserWhiteList(PaymentUserContext userContext, UserWhiteList userWhiteList,Map<String,Object>option) throws Exception;
	
	public UserWhiteList transferToAnotherDomain(PaymentUserContext userContext, String userWhiteListId, String anotherDomainId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String userWhiteListId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, UserWhiteList newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


