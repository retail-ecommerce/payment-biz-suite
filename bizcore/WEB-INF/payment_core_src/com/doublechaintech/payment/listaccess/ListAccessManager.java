
package com.doublechaintech.payment.listaccess;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.SmartList;

public interface ListAccessManager{

		

	public ListAccess createListAccess(PaymentUserContext userContext, String name, String internalName, boolean readPermission, boolean createPermission, boolean deletePermission, boolean updatePermission, boolean executionPermission, String appId) throws Exception;	
	public ListAccess updateListAccess(PaymentUserContext userContext,String listAccessId, int listAccessVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception;
	public ListAccess loadListAccess(PaymentUserContext userContext, String listAccessId, String [] tokensExpr) throws Exception;
	public ListAccess internalSaveListAccess(PaymentUserContext userContext, ListAccess listAccess) throws Exception;
	public ListAccess internalSaveListAccess(PaymentUserContext userContext, ListAccess listAccess,Map<String,Object>option) throws Exception;
	
	public ListAccess transferToAnotherApp(PaymentUserContext userContext, String listAccessId, String anotherAppId)  throws Exception;
 

	public void delete(PaymentUserContext userContext, String listAccessId, int version) throws Exception;
	public int deleteAll(PaymentUserContext userContext, String secureCode ) throws Exception;
	public void onNewInstanceCreated(PaymentUserContext userContext, ListAccess newCreated)throws Exception;

	/*======================================================DATA MAINTENANCE===========================================================*/
	



}


