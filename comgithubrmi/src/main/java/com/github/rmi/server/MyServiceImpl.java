package com.github.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Create by UncleCatMySelf in 21:05 2019\4\20 0020
 */
public class MyServiceImpl extends UnicastRemoteObject implements MyService {

    protected MyServiceImpl() throws RemoteException {
    }

    public String say(String someOne) throws RemoteException {
        return someOne + ",Welcome to Study!";
    }
}
