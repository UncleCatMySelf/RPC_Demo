package com.github.cxf.server;

import javax.jws.WebService;

/**
 * Create by UncleCatMySelf in 21:57 2019\4\23 0023
 */
@WebService(endpointInterface = "com.github.cxf.server.CxfService")
public class CxfServiceImpl implements CxfService {
    @Override
    public String say(String someOne) {
        return someOne + ",Welcome to Study!";
    }
}
