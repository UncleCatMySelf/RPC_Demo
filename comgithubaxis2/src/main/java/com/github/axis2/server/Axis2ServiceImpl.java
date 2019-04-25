package com.github.axis2.server;

/**
 * Create by UncleCatMySelf in 21:46 2019\4\25 0025
 */
public class Axis2ServiceImpl implements Axis2Service {

    @Override
    public String say(String someOne) {
        return someOne + ",Welcome to Study!";
    }
}
