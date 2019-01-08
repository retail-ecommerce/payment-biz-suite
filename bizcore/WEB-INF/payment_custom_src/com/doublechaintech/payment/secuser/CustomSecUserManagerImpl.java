
package com.doublechaintech.payment.secuser;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Enumeration;
import java.util.HashMap;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import com.skynet.infrastructure.CacheService;
import com.skynet.infrastructure.ESClient;
import com.skynet.infrastructure.EventService;
import com.skynet.infrastructure.GraphService;
import com.skynet.infrastructure.SMTPService;
import com.skynet.infrastructure.MessageService;


import com.doublechaintech.payment.PaymentUserContextImpl;
import com.doublechaintech.payment.LoginForm;
import com.doublechaintech.payment.BaseEntity;
import com.doublechaintech.payment.CommonError;
import com.doublechaintech.payment.DAOGroup;
import com.doublechaintech.payment.ManagerGroup;

import com.doublechaintech.payment.UserContextImpl;
import com.doublechaintech.payment.userapp.UserApp;
import com.doublechaintech.payment.PaymentUserContext;
import com.doublechaintech.payment.userapp.*;
import com.doublechaintech.payment.listaccess.*;
import com.doublechaintech.payment.objectaccess.*;
import com.doublechaintech.payment.PaymentChecker;
import com.doublechaintech.payment.loginhistory.LoginHistory;
import com.doublechaintech.payment.Message;



import com.terapico.uccaf.BaseUserContext;
import com.terapico.uccaf.UserContextProvider;
import com.terapico.caf.BeanFactory;
import com.terapico.utils.TextUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class CustomSecUserManagerImpl extends SecUserManagerImpl implements
        UserContextProvider {
       protected String environmentName;
    protected Boolean productEnvironment;
    protected DAOGroup daoGroup;
    protected ManagerGroup managerGroup;
    protected EventService eventService;
    protected String checkerBeanName = "checker";
    public String getCheckerBeanName() {
		return checkerBeanName;
	}
	public void setCheckerBeanName(String checkerBeanName) {
		this.checkerBeanName = checkerBeanName;
	}
    public EventService getEventService() {
        return eventService;
    }
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }
    public String getEnvironmentName() {
        return environmentName;
    }
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    public DAOGroup getDaoGroup() {
        return daoGroup;
    }
    public void setDaoGroup(DAOGroup daoGroup) {
        this.daoGroup = daoGroup;
    }
    public ManagerGroup getManagerGroup() {
        return managerGroup;
    }
    public void setManagerGroup(ManagerGroup managerGroup) {
        this.managerGroup = managerGroup;
    }
    public Boolean getProductEnvironment() {
        return productEnvironment;
    }

    public void setProductEnvironment(Boolean productEnvironment) {
        this.productEnvironment = productEnvironment;
    }
    
    public CustomSecUserManagerImpl() {
        // TODO Auto-generated constructor stub
    }
    
    public String confirmSession(PaymentUse<html>
<body>
<h1>500 Servlet Exception</h1>
<code><pre>
<script language='javascript' type='text/javascript'>
function show() { document.getElementById('trace').style.display = ''; }
</script>
<a style="text-decoration" href="javascript:show();">[show]</a> java.lang.NullPointerException
<span id="trace" style="display:none">
java.lang.NullPointerException
	at com.terapico.system.ObjectCollection.getFieldByKey(ObjectCollection.java:849)
	at _jsp._javaweb._java_0user_0base_0function__jsp._jspService(javaweb/java_user_base_function.jsp:563)
	at com.caucho.jsp.JavaPage.service(JavaPage.java:61)
	at com.caucho.jsp.Page.pageservice(Page.java:578)
	at com.caucho.server.dispatch.PageFilterChain.doFilter(PageFilterChain.java:195)
	at com.caucho.server.webapp.DispatchFilterChain.doFilter(DispatchFilterChain.java:112)
	at com.caucho.server.dispatch.ServletInvocation.service(ServletInvocation.java:265)
	at com.caucho.server.webapp.RequestDispatcherImpl.include(RequestDispatcherImpl.java:504)
	at com.caucho.server.webapp.RequestDispatcherImpl.include(RequestDispatcherImpl.java:368)
	at com.caucho.jsp.PageContextImpl.include(PageContextImpl.java:1009)
	at _jsp._javaweb._java_0app_0index__jsp._jspService(javaweb/java_app_index.jsp:61)
	at com.caucho.jsp.JavaPage.service(JavaPage.java:61)
	at com.caucho.jsp.Page.pageservice(Page.java:578)
	at com.caucho.server.dispatch.PageFilterChain.doFilter(PageFilterChain.java:195)
	at com.caucho.server.webapp.WebAppFilterChain.doFilter(WebAppFilterChain.java:187)
	at com.caucho.server.dispatch.ServletInvocation.service(ServletInvocation.java:265)
	at com.caucho.server.http.HttpRequest.handleRequest(HttpRequest.java:273)
	at com.caucho.server.port.TcpConnection.run(TcpConnection.java:682)
	at com.caucho.util.ThreadPool$Item.runTasks(ThreadPool.java:743)
	at com.caucho.util.ThreadPool$Item.run(ThreadPool.java:662)
	at java.lang.Thread.run(Thread.java:745)
</span>
</pre></code>
</body></html>
