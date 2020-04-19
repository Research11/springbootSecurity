package com.pb.security.Controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

import com.pb.common.domain.MymConstant;
import com.pb.security.code.ValidateCodeGenerator;
import com.pb.security.code.img.ImageCode;

@RestController
public class ValidateCodeController {
	private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy();
	@Autowired
    private ValidateCodeGenerator imageCodeGenerator;
	 @GetMapping("/image/code")
	    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 	System.out.println("------------------------------------------");
		 
	        ImageCode imageCode = (ImageCode) imageCodeGenerator.createCode();
	        BufferedImage image = imageCode.getImage();
	        imageCode.setImage(null);
	        sessionStrategy.setAttribute(new ServletWebRequest(request), MymConstant.SESSION_KEY_IMAGE_CODE, imageCode);
	        response.setContentType("image/jpeg");
	        ImageIO.write(image, "jpeg", response.getOutputStream());
	    }
}
