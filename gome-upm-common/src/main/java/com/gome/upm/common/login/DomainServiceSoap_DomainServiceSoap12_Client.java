
package com.gome.upm.common.login;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2016-04-14T16:52:43.868+08:00
 * Generated source version: 2.6.1
 * 
 */
public final class DomainServiceSoap_DomainServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "DomainService");

    private DomainServiceSoap_DomainServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DomainService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DomainService ss = new DomainService(wsdlURL, SERVICE_NAME);
        DomainServiceSoap port = ss.getDomainServiceSoap12();  
        
        {
        System.out.println("Invoking validLogon...");
        java.lang.String _validLogon_userName = "";
        java.lang.String _validLogon_userPwd = "";
        java.lang.String _validLogon__return = port.validLogon(_validLogon_userName, _validLogon_userPwd);
        System.out.println("validLogon.result=" + _validLogon__return);


        }

        System.exit(0);
    }

}
