
package com.doublechaintech.payment.secuserblocking;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface SecUserBlockingManager{

		

	public SecUserBlocking createSecUserBlocking(PaymentUserContext userContext, String who, String comments) throws Exception;	
	public SecUserBlocking updateSecUserBlocking(PaymentUserContext userContext,String secUserBlockingId, int secUserBlockingVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public SecUserBlocking loadSecUserBlocking(PaymentUserContext userContext, String secUserBlockingId, String [] tokensExpr) throws Exception;
	public SecUserBlocking internalSaveSecUserBlocking(PaymentUserContext userContext, SecUserBlocking secUserBlocking) throws Exception;
	public SecUserBlocking internalSaveSecUserBlocking(PaymentUserContext userContext, SecUserBlocking secUserBlocking,Map<String,Object>option) throws Exception;
	


	public void delete(PaymentUserContext userContext, String secUserBlockingId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, SecUserBlocking newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	

	//public  SecUserManager getSecUserManager(PaymentUserContext userContext, String secUserBlockingId, String login, String mobile, String email, String pwd, int verificationCode, DateTime verificationCodeExpire, DateTime lastLoginTime, String domainId ,String [] tokensExpr)  throws Exception;
	
	public  SecUserBlocking addSecUser(PaymentUserContext userContext, String secUserBlockingId, String login, String mobile, String email, String pwd, int verificationCode, DateTime verificationCodeExpire, DateTime lastLoginTime, String domainId , String [] tokensExpr)  throws Exception;
	public  SecUserBlocking removeSecUser(PaymentUserContext userContext, String secUserBlockingId, String secUserId, int secUserVersion,String [] tokensExpr)  throws Exception;
	public  SecUserBlocking updateSecUser(PaymentUserContext userContext, String secUserBlockingId, String secUserId, int secUserVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/



}


