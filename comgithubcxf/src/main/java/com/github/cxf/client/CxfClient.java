package com.github.cxf.client;

import com.github.cxf.server.CxfService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by UncleCatMySelf in 21:56 2019\4\23 0023
 */
public class CxfClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:cxf-client.xml");
        CxfService client = (CxfService)context.getBean("client");
        System.out.println(client.say("MySelf"));
    }
}
