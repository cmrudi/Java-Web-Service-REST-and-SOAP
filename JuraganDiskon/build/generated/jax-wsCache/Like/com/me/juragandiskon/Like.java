
package com.me.juragandiskon;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Like", targetNamespace = "http://juragandiskon.me.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Like {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.HelloResponse")
    @Action(input = "http://juragandiskon.me.com/Like/helloRequest", output = "http://juragandiskon.me.com/Like/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws MalformedURLException_Exception
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateAccessToken", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.ValidateAccessToken")
    @ResponseWrapper(localName = "validateAccessTokenResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.ValidateAccessTokenResponse")
    @Action(input = "http://juragandiskon.me.com/Like/validateAccessTokenRequest", output = "http://juragandiskon.me.com/Like/validateAccessTokenResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://juragandiskon.me.com/Like/validateAccessToken/Fault/MalformedURLException"),
        @FaultAction(className = IOException_Exception.class, value = "http://juragandiskon.me.com/Like/validateAccessToken/Fault/IOException")
    })
    public String validateAccessToken(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws IOException_Exception, MalformedURLException_Exception
    ;

    /**
     * 
     * @param productId
     * @param accessToken
     * @return
     *     returns java.lang.String
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setLike", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.SetLike")
    @ResponseWrapper(localName = "setLikeResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.SetLikeResponse")
    @Action(input = "http://juragandiskon.me.com/Like/setLikeRequest", output = "http://juragandiskon.me.com/Like/setLikeResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://juragandiskon.me.com/Like/setLike/Fault/IOException")
    })
    public String setLike(
        @WebParam(name = "productId", targetNamespace = "")
        String productId,
        @WebParam(name = "accessToken", targetNamespace = "")
        String accessToken)
        throws IOException_Exception
    ;

}