
package com.doublechaintech.payment.userdomain;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface UserDomainManager{

		

	public UserDomain createUserDomain(PaymentUserContext userContext, String name) throws Exception;	
	public UserDomain updateUserDomain(PaymentUserContext userContext,String userDomainId, int userDomainVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public UserDomain loadUserDomain(PaymentUserContext userContext, String userDomainId, String [] tokensExpr) throws Exception;
	public UserDomain internalSaveUserDomain(PaymentUserContext userContext, UserDomain userDomain) throws Exception;
	public UserDomain internalSaveUserDomain(PaymentUserContext userContext, UserDomain userDomain,Map<String,Object>option) throws Exception;
	


	public void delete(PaymentUserContext userContext, String userDomainId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, UserDomain newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	

	//public  UserWhiteListManager getUserWhiteListManager(PaymentUserContext userContext, String userDomainId, String userIdentity, String userSpecialFunctions ,String [] tokensExpr)  throws Exception;
	
	public  UserDomain addUserWhiteList(PaymentUserContext userContext, String userDomainId, String userIdentity, String userSpecialFunctions , String [] tokensExpr)  throws Exception;
	public  UserDomain removeUserWhiteList(PaymentUserContext userContext, String userDomainId, String userWhiteListId, int userWhiteListVersion,String [] tokensExpr)  throws Exception;
	public  UserDomain updateUserWhiteList(PaymentUserContext userContext, String userDomainId, String userWhiteListId, int userWhiteListVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  SecUserManager getSecUserManager(PaymentUserContext userContext, String userDomainId, String login, String mobile, String email, String pwd, int verificationCode, DateTime verificationCodeExpire, DateTime lastLoginTime ,String [] tokensExpr)  throws Exception;
	
	public  UserDomain addSecUser(PaymentUserContext userContext, String userDomainId, String login, String mobile, String email, String pwd, int verificationCode, DateTime verificationCodeExpire, DateTime lastLoginTime , String [] tokensExpr)  throws Exception;
	public  UserDomain removeSecUser(PaymentUserContext userContext, String userDomainId, String secUserId, int secUserVersion,String [] tokensExpr)  throws Exception;
	public  UserDomain updateSecUser(PaymentUserContext userContext, String userDomainId, String secUserId, int secUserVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*
	public  UserDomain associateSecUserListToNewBlocking(PaymentUserContext userContext, String userDomainId, String  secUserIds[], String who, String comments, String [] tokensExpr) throws Exception ;
	public  UserDomain associateSecUserListToBlocking(PaymentUserContext userContext, String userDomainId, String  secUserIds[],String blockingId, String [] tokensExpr) throws Exception ;

	*/



}


