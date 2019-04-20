package com.github.rmi.client;

import com.github.rmi.server.MyService;

import java.rmi.Naming;

/**
 * Create by UncleCatMySelf in 21:10 2019\4\20 0020
 */
public class ClientMain {

    public static void main(String[] args) throws Exception {
        //服务引入
        MyService myService = (MyService) Naming.lookup("rmi://localhost:8866/myService");
        //调用远程方法
        System.out.println("RMI 服务端调用返回：" + myService.say("MySelf"));
    }

}
