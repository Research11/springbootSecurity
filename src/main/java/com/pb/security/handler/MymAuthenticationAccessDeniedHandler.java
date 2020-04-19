package com.pb.security.handler;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pb.common.domain.MymConstant;
import com.pb.common.domain.ResponseBo;
import com.pb.common.util.VerifyUtil;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MymAuthenticationAccessDeniedHandler implements AccessDeniedHandler {

    private ObjectMapper mapper = new ObjectMapper();

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException {

        if (VerifyUtil.isAjaxRequest(request)) {
            response.setContentType(MymConstant.JSON_UTF8);
            response.getWriter().write(this.mapper.writeValueAsString(ResponseBo.error("没有该权限！")));
        } else {
            redirectStrategy.sendRedirect(request, response, MymConstant.MYM_ACCESS_DENY_URL);
        }
    }
}
