//package com.pb.Controller;
//
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.pb.Config.propertes.SecurityProperties;
//
//@Controller
//public class LoginController {
//	
//	 private Logger log = LoggerFactory.getLogger(this.getClass());
//	 private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//	 private RequestCache requestCache = new HttpSessionRequestCache();
//	 @Autowired
//	 private SecurityProperties securityproperties;
//	 
//	@GetMapping("/login")
//    public String login(HttpServletRequest request, HttpServletResponse response) {
//        SavedRequest savedRequest = requestCache.getRequest(request, response);
//        if (savedRequest != null) {
//            String redirectUrl = savedRequest.getRedirectUrl();
//            System.out.println(redirectUrl);
//            log.info("引发跳转的请求是：{}", redirectUrl);
//        }
//        return "login";
//    }
//	
//	@GetMapping("/")
//    public void success(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        redirectStrategy.sendRedirect(request, response, securityproperties.getIndexUrl());
//    }
//	
//	@GetMapping("index")
//    public String index(Authentication authentication, Model model) {
//        model.addAttribute("user",authentication.getPrincipal());
//        return "index";
//    }
//	
//}
