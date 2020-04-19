package com.pb.security.exception;

import org.springframework.security.core.AuthenticationException;

public class MymCredentialExcetion extends AuthenticationException {

    private static final long serialVersionUID = -920087729589688230L;

    public MymCredentialExcetion(String message) {
        super(message);
    }
}
