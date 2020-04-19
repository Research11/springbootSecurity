package com.pb.security.session;


import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.session.InvalidSessionStrategy;

import com.pb.Config.propertes.SecurityProperties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理 session 失效
 */
public class MymInvalidSessionStrategy implements InvalidSessionStrategy {

    private SecurityProperties securityProperties;

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response) throws IOException {
        redirectStrategy.sendRedirect(request, response, securityProperties.getLogoutUrl());
    }

    public SecurityProperties getSecurityProperties() {
        return securityProperties;
    }

    public void setSecurityProperties(SecurityProperties securityProperties) {
        this.securityProperties = securityProperties;
    }
}
