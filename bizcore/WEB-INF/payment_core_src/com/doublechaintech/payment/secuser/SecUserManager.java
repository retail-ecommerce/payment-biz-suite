
package com.doublechaintech.payment.secuser;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface SecUserManager{

		
	

	public SecUser loadSecUserWithLogin(PaymentUserContext userContext, String login, Map<String,Object>tokens) throws Exception;

	 
	

	public SecUser loadSecUserWithEmail(PaymentUserContext userContext, String email, Map<String,Object>tokens) throws Exception;

	 
	

	public SecUser loadSecUserWithMobile(PaymentUserContext userContext, String mobile, Map<String,Object>tokens) throws Exception;

	 

	public SecUser createSecUser(PaymentUserContext userContext, String login, String mobile, String email, String pwd, int verificationCode, DateTime verificationCodeExpire, DateTime lastLoginTime, String domainId) throws Exception;	
	public SecUser updateSecUser(PaymentUserContext userContext,String secUserId, int secUserVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public SecUser loadSecUser(PaymentUserContext userContext, String secUserId, String [] tokensExpr) throws Exception;
	public SecUser internalSaveSecUser(PaymentUserContext userContext, SecUser secUser) throws Exception;
	public SecUser internalSaveSecUser(PaymentUserContext userContext, SecUser secUser,Map<String,Object>option) throws Exception;
	
	public SecUser transferToAnotherDomain(PaymentUserContext userContext, String secUserId, String anotherDomainId)  throws Exception;
 	public SecUser block(PaymentUserContext userContext, String secUserId, String who, String comments
)  throws Exception;


	public void delete(PaymentUserContext userContext, String secUserId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, SecUser newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	

	//public  UserAppManager getUserAppManager(PaymentUserContext userContext, String secUserId, String title, String appIcon, boolean fullAccess, String permission, String objectType, String objectId, String location ,String [] tokensExpr)  throws Exception;
	
	public  SecUser addUserApp(PaymentUserContext userContext, String secUserId, String title, String appIcon, boolean fullAccess, String permission, String objectType, String objectId, String location , String [] tokensExpr)  throws Exception;
	public  SecUser removeUserApp(PaymentUserContext userContext, String secUserId, String userAppId, int userAppVersion,String [] tokensExpr)  throws Exception;
	public  SecUser updateUserApp(PaymentUserContext userContext, String secUserId, String userAppId, int userAppVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  LoginHistoryManager getLoginHistoryManager(PaymentUserContext userContext, String secUserId, String fromIp, String description ,String [] tokensExpr)  throws Exception;
	
	public  SecUser addLoginHistory(PaymentUserContext userContext, String secUserId, String fromIp, String description , String [] tokensExpr)  throws Exception;
	public  SecUser removeLoginHistory(PaymentUserContext userContext, String secUserId, String loginHistoryId, int loginHistoryVersion,String [] tokensExpr)  throws Exception;
	public  SecUser updateLoginHistory(PaymentUserContext userContext, String secUserId, String loginHistoryId, int loginHistoryVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/



}


