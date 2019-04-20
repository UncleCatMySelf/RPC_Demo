package com.github.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Create by UncleCatMySelf in 21:03 2019\4\20 0020
 */
public interface MyService extends Remote {

    String say(String someOne)throws RemoteException;

}
