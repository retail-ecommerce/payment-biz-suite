
package com.doublechaintech.payment.loginhistory;

import java.util.Date;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigDecimal;
import com.terapico.caf.DateTime;
import com.doublechaintech.payment.BaseEntity;


import com.doublechaintech.payment.Message;
import com.doublechaintech.payment.SmartList;
import com.doublechaintech.payment.MultipleAccessKey;

import com.doublechaintech.payment.PaymentUserContext;
//import com.doublechaintech.payment.BaseManagerImpl;
import com.doublechaintech.payment.PaymentCheckerManager;
import com.doublechaintech.payment.CustomPaymentCheckerManager;

import com.doublechaintech.payment.secuser.SecUser;

import com.doublechaintech.payment.secuser.CandidateSecUser;







public class LoginHistoryManagerImpl extends CustomPaymentCheckerManager implements LoginHistoryManager {
	
	private static final String SERVICE_TYPE = "LoginHistory";
	
	@Override
	public String serviceFor(){
		return SERVICE_TYPE;
	}
	
	
	protected void throwExceptionWithMessage(String value) throws LoginHistoryManagerException{
	
		Message message = new Message();
		message.setBody(value);
		throw new LoginHistoryManagerException(message);

	}
	
	

 	protected LoginHistory saveLoginHistory(PaymentUserContext userContext, LoginHistory loginHistory, String [] tokensExpr) throws Exception{	
 		//return getLoginHistoryDAO().save(loginHistory, tokens);
 		
 		Map<String,Object>tokens = parseTokens(tokensExpr);
 		
 		return saveLoginHistory(userContext, loginHistory, tokens);
 	}
 	
 	protected LoginHistory saveLoginHistoryDetail(PaymentUserContext userContext, LoginHistory loginHistory) throws Exception{	

 		
 		return saveLoginHistory(userContext, loginHistory, allTokens());
 	}
 	
 	public LoginHistory loadLoginHistory(PaymentUserContext userContext, String loginHistoryId, String [] tokensExpr) throws Exception{				
 
 		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
		userContext.getChecker().throwExceptionIfHasErrors( LoginHistoryManagerException.class);

 			
 		Map<String,Object>tokens = parseTokens(tokensExpr);
 		
 		LoginHistory loginHistory = loadLoginHistory( userContext, loginHistoryId, tokens);
 		//do some calc before sent to customer?
 		return present(userContext,loginHistory, tokens);
 	}
 	
 	
 	 public LoginHistory searchLoginHistory(PaymentUserContext userContext, String loginHistoryId, String textToSearch,String [] tokensExpr) throws Exception{				
 
 		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
		userContext.getChecker().throwExceptionIfHasErrors( LoginHistoryManagerException.class);

 		
 		Map<String,Object>tokens = tokens().allTokens().searchEntireObjectText("startsWith", textToSearch).initWithArray(tokensExpr);
 		
 		LoginHistory loginHistory = loadLoginHistory( userContext, loginHistoryId, tokens);
 		//do some calc before sent to customer?
 		return present(userContext,loginHistory, tokens);
 	}
 	
 	

 	protected LoginHistory present(PaymentUserContext userContext, LoginHistory loginHistory, Map<String, Object> tokens) throws Exception {
		
		
		addActions(userContext,loginHistory,tokens);
		
		
		LoginHistory  loginHistoryToPresent = userContext.getDAOGroup().getLoginHistoryDAO().present(loginHistory, tokens);
		
		List<BaseEntity> entityListToNaming = loginHistoryToPresent.collectRefercencesFromLists();
		userContext.getDAOGroup().getLoginHistoryDAO().alias(entityListToNaming);
		
		return  loginHistoryToPresent;
		
		
	}
 
 	
 	
 	public LoginHistory loadLoginHistoryDetail(PaymentUserContext userContext, String loginHistoryId) throws Exception{	
 		LoginHistory loginHistory = loadLoginHistory( userContext, loginHistoryId, allTokens());
 		return present(userContext,loginHistory, allTokens());
		
 	}
 	
 	public Object view(PaymentUserContext userContext, String loginHistoryId) throws Exception{	
 		LoginHistory loginHistory = loadLoginHistory( userContext, loginHistoryId, viewTokens());
 		return present(userContext,loginHistory, allTokens());
		
 	}
 	protected LoginHistory saveLoginHistory(PaymentUserContext userContext, LoginHistory loginHistory, Map<String,Object>tokens) throws Exception{	
 		return userContext.getDAOGroup().getLoginHistoryDAO().save(loginHistory, tokens);
 	}
 	protected LoginHistory loadLoginHistory(PaymentUserContext userContext, String loginHistoryId, Map<String,Object>tokens) throws Exception{	
		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
		userContext.getChecker().throwExceptionIfHasErrors( LoginHistoryManagerException.class);

 
 		return userContext.getDAOGroup().getLoginHistoryDAO().load(loginHistoryId, tokens);
 	}

	


 	


 	
 	
 	protected<T extends BaseEntity> void addActions(PaymentUserContext userContext, LoginHistory loginHistory, Map<String, Object> tokens){
		super.addActions(userContext, loginHistory, tokens);
		
		addAction(userContext, loginHistory, tokens,"@create","createLoginHistory","createLoginHistory/","main","primary");
		addAction(userContext, loginHistory, tokens,"@update","updateLoginHistory","updateLoginHistory/"+loginHistory.getId()+"/","main","primary");
		addAction(userContext, loginHistory, tokens,"@copy","cloneLoginHistory","cloneLoginHistory/"+loginHistory.getId()+"/","main","primary");
		
		addAction(userContext, loginHistory, tokens,"login_history.transfer_to_sec_user","transferToAnotherSecUser","transferToAnotherSecUser/"+loginHistory.getId()+"/","main","primary");
	
		
		
	}// end method of protected<T extends BaseEntity> void addActions(PaymentUserContext userContext, LoginHistory loginHistory, Map<String, Object> tokens){
	
 	
 	
 
 	
 	


	public LoginHistory createLoginHistory(PaymentUserContext userContext,String fromIp, String description, String secUserId) throws Exception
	{
		
		

		

		userContext.getChecker().checkFromIpOfLoginHistory(fromIp);
		userContext.getChecker().checkDescriptionOfLoginHistory(description);
	
		userContext.getChecker().throwExceptionIfHasErrors(LoginHistoryManagerException.class);


		LoginHistory loginHistory=createNewLoginHistory();	

		loginHistory.setLoginTime(userContext.now());
		loginHistory.setFromIp(fromIp);
		loginHistory.setDescription(description);
			
		SecUser secUser = loadSecUser(userContext, secUserId,emptyOptions());
		loginHistory.setSecUser(secUser);
		
		

		loginHistory = saveLoginHistory(userContext, loginHistory, emptyOptions());
		
		onNewInstanceCreated(userContext, loginHistory);
		return loginHistory;

		
	}
	protected LoginHistory createNewLoginHistory() 
	{
		
		return new LoginHistory();		
	}
	
	protected void checkParamsForUpdatingLoginHistory(PaymentUserContext userContext,String loginHistoryId, int loginHistoryVersion, String property, String newValueExpr,String [] tokensExpr)throws Exception
	{
		

		
		
		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
		userContext.getChecker().checkVersionOfLoginHistory( loginHistoryVersion);
		

		if(LoginHistory.FROM_IP_PROPERTY.equals(property)){
			userContext.getChecker().checkFromIpOfLoginHistory(parseString(newValueExpr));
		}
		if(LoginHistory.DESCRIPTION_PROPERTY.equals(property)){
			userContext.getChecker().checkDescriptionOfLoginHistory(parseString(newValueExpr));
		}		

		
	
		userContext.getChecker().throwExceptionIfHasErrors(LoginHistoryManagerException.class);
	
		
	}
	
	
	
	public LoginHistory clone(PaymentUserContext userContext, String fromLoginHistoryId) throws Exception{
		
		return userContext.getDAOGroup().getLoginHistoryDAO().clone(fromLoginHistoryId, this.allTokens());
	}
	
	public LoginHistory internalSaveLoginHistory(PaymentUserContext userContext, LoginHistory loginHistory) throws Exception 
	{
		return internalSaveLoginHistory(userContext, loginHistory, allTokens());

	}
	public LoginHistory internalSaveLoginHistory(PaymentUserContext userContext, LoginHistory loginHistory, Map<String,Object> options) throws Exception 
	{
		//checkParamsForUpdatingLoginHistory(userContext, loginHistoryId, loginHistoryVersion, property, newValueExpr, tokensExpr);
		
		
		synchronized(loginHistory){ 
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			//make changes to LoginHistory.
			
			
			loginHistory = saveLoginHistory(userContext, loginHistory, options);
			return loginHistory;
			
		}

	}
	
	public LoginHistory updateLoginHistory(PaymentUserContext userContext,String loginHistoryId, int loginHistoryVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception 
	{
		checkParamsForUpdatingLoginHistory(userContext, loginHistoryId, loginHistoryVersion, property, newValueExpr, tokensExpr);
		
		
		
		LoginHistory loginHistory = loadLoginHistory(userContext, loginHistoryId, allTokens());
		if(loginHistory.getVersion() != loginHistoryVersion){
			String message = "The target version("+loginHistory.getVersion()+") is not equals to version("+loginHistoryVersion+") provided";
			throwExceptionWithMessage(message);
		}
		synchronized(loginHistory){ 
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			//make changes to LoginHistory.
			
			loginHistory.changeProperty(property, newValueExpr);
			loginHistory = saveLoginHistory(userContext, loginHistory, tokens().done());
			return present(userContext,loginHistory, mergedAllTokens(tokensExpr));
			//return saveLoginHistory(userContext, loginHistory, tokens().done());
		}

	}
	
	public LoginHistory updateLoginHistoryProperty(PaymentUserContext userContext,String loginHistoryId, int loginHistoryVersion, String property, String newValueExpr,String [] tokensExpr) throws Exception 
	{
		checkParamsForUpdatingLoginHistory(userContext, loginHistoryId, loginHistoryVersion, property, newValueExpr, tokensExpr);
		
		LoginHistory loginHistory = loadLoginHistory(userContext, loginHistoryId, allTokens());
		if(loginHistory.getVersion() != loginHistoryVersion){
			String message = "The target version("+loginHistory.getVersion()+") is not equals to version("+loginHistoryVersion+") provided";
			throwExceptionWithMessage(message);
		}
		synchronized(loginHistory){ 
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			//make changes to LoginHistory.
			
			loginHistory.changeProperty(property, newValueExpr);
			
			loginHistory = saveLoginHistory(userContext, loginHistory, tokens().done());
			return present(userContext,loginHistory, mergedAllTokens(tokensExpr));
			//return saveLoginHistory(userContext, loginHistory, tokens().done());
		}

	}
	protected Map<String,Object> emptyOptions(){
		return tokens().done();
	}
	
	protected LoginHistoryTokens tokens(){
		return LoginHistoryTokens.start();
	}
	protected Map<String,Object> parseTokens(String [] tokensExpr){
		return tokens().initWithArray(tokensExpr);
	}
	protected Map<String,Object> allTokens(){
		return LoginHistoryTokens.all();
	}
	protected Map<String,Object> viewTokens(){
		return tokens().allTokens()
		.done();

	}
	protected Map<String,Object> mergedAllTokens(String []tokens){
		return LoginHistoryTokens.mergeAll(tokens).done();
	}
	
	protected void checkParamsForTransferingAnotherSecUser(PaymentUserContext userContext, String loginHistoryId, String anotherSecUserId) throws Exception
 	{
 		
 		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
 		userContext.getChecker().checkIdOfSecUser(anotherSecUserId);//check for optional reference
 		userContext.getChecker().throwExceptionIfHasErrors(LoginHistoryManagerException.class);
 		
 	}
 	public LoginHistory transferToAnotherSecUser(PaymentUserContext userContext, String loginHistoryId, String anotherSecUserId) throws Exception
 	{
 		checkParamsForTransferingAnotherSecUser(userContext, loginHistoryId,anotherSecUserId);
 
		LoginHistory loginHistory = loadLoginHistory(userContext, loginHistoryId, allTokens());	
		synchronized(loginHistory){
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			SecUser secUser = loadSecUser(userContext, anotherSecUserId, emptyOptions());		
			loginHistory.updateSecUser(secUser);		
			loginHistory = saveLoginHistory(userContext, loginHistory, emptyOptions());
			
			return present(userContext,loginHistory, allTokens());
			
		}

 	}
 	
	

	protected void checkParamsForTransferingAnotherSecUserWithLogin(PaymentUserContext userContext, String loginHistoryId, String anotherLogin) throws Exception
 	{
 		
 		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
 		userContext.getChecker().checkLoginOfSecUser( anotherLogin);
 		userContext.getChecker().throwExceptionIfHasErrors(LoginHistoryManagerException.class);
 		
 	}

 	public LoginHistory transferToAnotherSecUserWithLogin(PaymentUserContext userContext, String loginHistoryId, String anotherLogin) throws Exception
 	{
 		checkParamsForTransferingAnotherSecUserWithLogin(userContext, loginHistoryId,anotherLogin);
 		LoginHistory loginHistory = loadLoginHistory(userContext, loginHistoryId, allTokens());	
		synchronized(loginHistory){
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			SecUser secUser = loadSecUserWithLogin(userContext, anotherLogin, emptyOptions());		
			loginHistory.updateSecUser(secUser);		
			loginHistory = saveLoginHistory(userContext, loginHistory, emptyOptions());
			
			return present(userContext,loginHistory, allTokens());
			
		}
 	}	

	 

	protected void checkParamsForTransferingAnotherSecUserWithEmail(PaymentUserContext userContext, String loginHistoryId, String anotherEmail) throws Exception
 	{
 		
 		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
 		userContext.getChecker().checkEmailOfSecUser( anotherEmail);
 		userContext.getChecker().throwExceptionIfHasErrors(LoginHistoryManagerException.class);
 		
 	}

 	public LoginHistory transferToAnotherSecUserWithEmail(PaymentUserContext userContext, String loginHistoryId, String anotherEmail) throws Exception
 	{
 		checkParamsForTransferingAnotherSecUserWithEmail(userContext, loginHistoryId,anotherEmail);
 		LoginHistory loginHistory = loadLoginHistory(userContext, loginHistoryId, allTokens());	
		synchronized(loginHistory){
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			SecUser secUser = loadSecUserWithEmail(userContext, anotherEmail, emptyOptions());		
			loginHistory.updateSecUser(secUser);		
			loginHistory = saveLoginHistory(userContext, loginHistory, emptyOptions());
			
			return present(userContext,loginHistory, allTokens());
			
		}
 	}	

	 

	protected void checkParamsForTransferingAnotherSecUserWithMobile(PaymentUserContext userContext, String loginHistoryId, String anotherMobile) throws Exception
 	{
 		
 		userContext.getChecker().checkIdOfLoginHistory(loginHistoryId);
 		userContext.getChecker().checkMobileOfSecUser( anotherMobile);
 		userContext.getChecker().throwExceptionIfHasErrors(LoginHistoryManagerException.class);
 		
 	}

 	public LoginHistory transferToAnotherSecUserWithMobile(PaymentUserContext userContext, String loginHistoryId, String anotherMobile) throws Exception
 	{
 		checkParamsForTransferingAnotherSecUserWithMobile(userContext, loginHistoryId,anotherMobile);
 		LoginHistory loginHistory = loadLoginHistory(userContext, loginHistoryId, allTokens());	
		synchronized(loginHistory){
			//will be good when the loginHistory loaded from this JVM process cache.
			//also good when there is a ram based DAO implementation
			SecUser secUser = loadSecUserWithMobile(userContext, anotherMobile, emptyOptions());		
			loginHistory.updateSecUser(secUser);		
			loginHistory = saveLoginHistory(userContext, loginHistory, emptyOptions());
			
			return present(userContext,loginHistory, allTokens());
			
		}
 	}	

	  	
 	
 	
	public CandidateSecUser requestCandidateSecUser(PaymentUserContext userContext, String ownerClass, String id, String filterKey, int pageNo) throws Exception {

		CandidateSecUser result = new CandidateSecUser();
		result.setOwnerClass(ownerClass);
		result.setOwnerId(id);
		result.setFilterKey(filterKey==null?"":filterKey.trim());
		result.setPageNo(pageNo);
		result.setValueFieldName("id");
		result.setDisplayFieldName("login");
		
		pageNo = Math.max(1, pageNo);
		int pageSize = 20;
		//requestCandidateProductForSkuAsOwner
		SmartList<SecUser> candidateList = userContext.getDAOGroup().getSecUserDAO().requestCandidateSecUserForLoginHistory(userContext,ownerClass, id, filterKey, pageNo, pageSize);
		result.setCandidates(candidateList);
		int totalCount = candidateList.getTotalCount();
		result.setTotalPage(Math.max(1, (totalCount + pageSize -1)/pageSize ));
		return result;
	}
 	
 //--------------------------------------------------------------
	
	 	
 	protected SecUser loadSecUser(PaymentUserContext userContext, String newSecUserId, Map<String,Object> options) throws Exception
 	{
		
 		return userContext.getDAOGroup().getSecUserDAO().load(newSecUserId, options);
 	}
 	
 	protected SecUser loadSecUserWithLogin(PaymentUserContext userContext, String newLogin, Map<String,Object> options) throws Exception
 	{
		
 		return userContext.getDAOGroup().getSecUserDAO().loadByLogin(newLogin, options);
 	}
 	
 	
 	protected SecUser loadSecUserWithEmail(PaymentUserContext userContext, String newEmail, Map<String,Object> options) throws Exception
 	{
		
 		return userContext.getDAOGroup().getSecUserDAO().loadByEmail(newEmail, options);
 	}
 	
 	
 	protected SecUser loadSecUserWithMobile(PaymentUserContext userContext, String newMobile, Map<String,Object> options) throws Exception
 	{
		
 		return userContext.getDAOGroup().getSecUserDAO().loadByMobile(newMobile, options);
 	}
 	
 	
 	
 	
	
	//--------------------------------------------------------------

	public void delete(PaymentUserContext userContext, String loginHistoryId, int loginHistoryVersion) throws Exception {
		//deleteInternal(userContext, loginHistoryId, loginHistoryVersion);		
	}
	protected void deleteInternal(PaymentUserContext userContext,
			String loginHistoryId, int loginHistoryVersion) throws Exception{
			
		userContext.getDAOGroup().getLoginHistoryDAO().delete(loginHistoryId, loginHistoryVersion);
	}
	
	public LoginHistory forgetByAll(PaymentUserContext userContext, String loginHistoryId, int loginHistoryVersion) throws Exception {
		return forgetByAllInternal(userContext, loginHistoryId, loginHistoryVersion);		
	}
	protected LoginHistory forgetByAllInternal(PaymentUserContext userContext,
			String loginHistoryId, int loginHistoryVersion) throws Exception{
			
		return userContext.getDAOGroup().getLoginHistoryDAO().disconnectFromAll(loginHistoryId, loginHistoryVersion);
	}
	

	
	public int deleteAll(PaymentUserContext userContext, String secureCode) throws Exception
	{
		/*
		if(!("dElEtEaLl".equals(secureCode))){
			throw new LoginHistoryManagerException("Your secure code is not right, please guess again");
		}
		return deleteAllInternal(userContext);
		*/
		return 0;
	}
	
	
	protected int deleteAllInternal(PaymentUserContext userContext) throws Exception{
		return userContext.getDAOGroup().getLoginHistoryDAO().deleteAll();
	}


	
	
	
	
	

	public void onNewInstanceCreated(PaymentUserContext userContext, LoginHistory newCreated) throws Exception{
		ensureRelationInGraph(userContext, newCreated);
		sendCreationEvent(userContext, newCreated);
	}

}


