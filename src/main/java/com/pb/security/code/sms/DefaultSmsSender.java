package com.pb.security.code.sms;

import org.springframework.beans.factory.annotation.Value;

public class DefaultSmsSender implements SmsCodeSender {

    @Value("${lbs.security.code.sms.expire-in}")
    private long expireIn;

    @Override
    public void send(String mobile, String code) {
        System.out.println("手机号：" + mobile + "的短信验证码为：" + code + "，有效时间：" + expireIn + " 秒");
    }
}
