package com.min.edu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AccessLogFilter implements Filter {

	private static final Logger log = LoggerFactory.getLogger(AccessLogFilter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = StringUtils.defaultIfEmpty(req.getRemoteAddr(), "-");
		String url = StringUtils.defaultIfEmpty(req.getRequestURL().toString(), "-");
		String queryString = StringUtils.defaultIfEmpty(req.getQueryString(), "");
		String fullUrl = url;
		fullUrl += StringUtils.isNotEmpty(queryString)?"?"+queryString:queryString;
		
		StringBuffer sb = new StringBuffer();
		sb.append(remoteAddr).append(":").append(fullUrl);
		
		log.info("╰(*°▽°*)╯ 요청된 Client 정보 : {}", sb);
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("(☞ﾟヮﾟ)☞ Filter 들어왔습니다");
	}

	@Override
	public void destroy() {
		log.info("☜(ﾟヮﾟ☜) Filter 나갔습니다");
	}
	
	

}
