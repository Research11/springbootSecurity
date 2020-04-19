package com.pb.Config.propertes;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "lbs")
public class MyProperies {

    private boolean openAopLog = true;

   
    public boolean isOpenAopLog() {
        return openAopLog;
    }

    public void setOpenAopLog(boolean openAopLog) {
        this.openAopLog = openAopLog;
    }

  
}
