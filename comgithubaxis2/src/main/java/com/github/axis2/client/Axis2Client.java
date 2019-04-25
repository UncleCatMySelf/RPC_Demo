package com.github.axis2.client;

import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.addressing.EndpointReference;

import javax.xml.namespace.QName;

/**
 * Create by UncleCatMySelf in 22:39 2019\4\25 0025
 */
public class Axis2Client {
    public static void main(String[] args) {
        try {
            EndpointReference epr = new EndpointReference("http://localhost:8080/services/MyAxis2");
            RPCServiceClient serviceClient = new RPCServiceClient();
            Options options = serviceClient.getOptions();
            options.setManageSession(true);
            options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT,true);
            options.setTo(epr);
            QName qName = new QName("http://server.axis2.github.com","say");
            Object[] params = new Object[]{"MySelf"};
            Class[] returns = new Class[]{String.class};
            Object[] response = serviceClient.invokeBlocking(qName,params,returns);
            serviceClient.cleanupTransport();
            String result = (String) response[0];

            if (result == null){
                System.out.println("不成功！");
            } else {
                System.out.println(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
