
package com.doublechaintech.payment.loginhistory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface LoginHistoryManager{

		

	public LoginHistory createLoginHistory(PaymentUserContext userContext, String fromIp, String description, String secUserId) throws Exception;	
	public LoginHistory updateLoginHistory(PaymentUserContext userContext,String loginHistoryId, int loginHistoryVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public LoginHistory loadLoginHistory(PaymentUserContext userContext, String loginHistoryId, String [] tokensExpr) throws Exception;
	public LoginHistory internalSaveLoginHistory(PaymentUserContext userContext, LoginHistory loginHistory) throws Exception;
	public LoginHistory internalSaveLoginHistory(PaymentUserContext userContext, LoginHistory loginHistory,Map<String,Object>option) throws Exception;
	
	public LoginHistory transferToAnotherSecUser(PaymentUserContext userContext, String loginHistoryId, String anotherSecUserId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String loginHistoryId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, LoginHistory newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


