package com.liwei.shiro.filter;

import java.util.Collection;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.AuthenticationFilter;


public class MobileTokenAuthentication extends AuthenticationFilter {
	public static final String TOKEN = "token";
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		System.out.println("进入token 判断");
		Subject subject = getSubject(request,response);
		Session session = subject.getSession();
		Collection<Object> keys = session.getAttributeKeys();
		for (Object object : keys) {
			if(object instanceof String){
				String a=(String)object;
				System.out.println(a+"::"+session.getAttribute(a));
			}
		}
		session.setAttribute("token", "nihao");
		return true;
	}
	
	
}
