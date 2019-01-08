
package com.doublechaintech.payment.platform;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface PlatformManager{

		

	public Platform createPlatform(PaymentUserContext userContext, String name, String introduction, String currentVersion) throws Exception;	
	public Platform updatePlatform(PaymentUserContext userContext,String platformId, int platformVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public Platform loadPlatform(PaymentUserContext userContext, String platformId, String [] tokensExpr) throws Exception;
	public Platform internalSavePlatform(PaymentUserContext userContext, Platform platform) throws Exception;
	public Platform internalSavePlatform(PaymentUserContext userContext, Platform platform,Map<String,Object>option) throws Exception;
	


	public void delete(PaymentUserContext userContext, String platformId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, Platform newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


