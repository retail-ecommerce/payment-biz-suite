
package com.doublechaintech.payment.userapp;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface UserAppManager{

		

	public UserApp createUserApp(PaymentUserContext userContext, String title, String secUserId, String appIcon, boolean fullAccess, String permission, String objectType, String objectId, String location) throws Exception;	
	public UserApp updateUserApp(PaymentUserContext userContext,String userAppId, int userAppVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public UserApp loadUserApp(PaymentUserContext userContext, String userAppId, String [] tokensExpr) throws Exception;
	public UserApp internalSaveUserApp(PaymentUserContext userContext, UserApp userApp) throws Exception;
	public UserApp internalSaveUserApp(PaymentUserContext userContext, UserApp userApp,Map<String,Object>option) throws Exception;
	
	public UserApp transferToAnotherSecUser(PaymentUserContext userContext, String userAppId, String anotherSecUserId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String userAppId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, UserApp newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	

	//public  ListAccessManager getListAccessManager(PaymentUserContext userContext, String userAppId, String name, String internalName, boolean readPermission, boolean createPermission, boolean deletePermission, boolean updatePermission, boolean executionPermission ,String [] tokensExpr)  throws Exception;
	
	public  UserApp addListAccess(PaymentUserContext userContext, String userAppId, String name, String internalName, boolean readPermission, boolean createPermission, boolean deletePermission, boolean updatePermission, boolean executionPermission , String [] tokensExpr)  throws Exception;
	public  UserApp removeListAccess(PaymentUserContext userContext, String userAppId, String listAccessId, int listAccessVersion,String [] tokensExpr)  throws Exception;
	public  UserApp updateListAccess(PaymentUserContext userContext, String userAppId, String listAccessId, int listAccessVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/

	//public  ObjectAccessManager getObjectAccessManager(PaymentUserContext userContext, String userAppId, String name, String objectType, String list1, String list2, String list3, String list4, String list5, String list6, String list7, String list8, String list9 ,String [] tokensExpr)  throws Exception;
	
	public  UserApp addObjectAccess(PaymentUserContext userContext, String userAppId, String name, String objectType, String list1, String list2, String list3, String list4, String list5, String list6, String list7, String list8, String list9 , String [] tokensExpr)  throws Exception;
	public  UserApp removeObjectAccess(PaymentUserContext userContext, String userAppId, String objectAccessId, int objectAccessVersion,String [] tokensExpr)  throws Exception;
	public  UserApp updateObjectAccess(PaymentUserContext userContext, String userAppId, String objectAccessId, int objectAccessVersion, String property, String newValueExpr,String [] tokensExpr)  throws Exception;

	/*

	*/



}


