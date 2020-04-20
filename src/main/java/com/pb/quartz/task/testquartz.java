package com.pb.quartz.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pb.common.annotation.CronTag;



@CronTag("testquartz11")
public class testquartz {
	 private Logger log = LoggerFactory.getLogger(this.getClass());

	    public void testy(String params) {
	        log.info("我是带参数的test-------------------------方法，正在被执行，参数为：{}" , params);
	    }

	    public void testw() {
	        log.info("我是不带参数的test1--------------------------方法，正在被执行");
	    }
}
