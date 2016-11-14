
package com.me.juragandiskon;

import java.util.List;
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
@WebService(name = "ConfirmationPurchase", targetNamespace = "http://juragandiskon.me.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConfirmationPurchase {


    /**
     * 
     * @param prodId
     * @param accessToken
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPurchaseInfo", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.GetPurchaseInfo")
    @ResponseWrapper(localName = "getPurchaseInfoResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.GetPurchaseInfoResponse")
    @Action(input = "http://juragandiskon.me.com/ConfirmationPurchase/getPurchaseInfoRequest", output = "http://juragandiskon.me.com/ConfirmationPurchase/getPurchaseInfoResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://juragandiskon.me.com/ConfirmationPurchase/getPurchaseInfo/Fault/IOException")
    })
    public List<String> getPurchaseInfo(
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "prod_id", targetNamespace = "")
        int prodId)
        throws IOException_Exception
    ;

    /**
     * 
     * @param buyerAddress
     * @param quantity
     * @param phoneNumber
     * @param postalCode
     * @param verifNum
     * @param prodId
     * @param accessToken
     * @param buyerName
     * @param creditCard
     * @return
     *     returns java.lang.String
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "purchaseProduct", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.PurchaseProduct")
    @ResponseWrapper(localName = "purchaseProductResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.PurchaseProductResponse")
    @Action(input = "http://juragandiskon.me.com/ConfirmationPurchase/purchaseProductRequest", output = "http://juragandiskon.me.com/ConfirmationPurchase/purchaseProductResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://juragandiskon.me.com/ConfirmationPurchase/purchaseProduct/Fault/IOException")
    })
    public String purchaseProduct(
        @WebParam(name = "prod_id", targetNamespace = "")
        String prodId,
        @WebParam(name = "access_token", targetNamespace = "")
        String accessToken,
        @WebParam(name = "buyerName", targetNamespace = "")
        String buyerName,
        @WebParam(name = "quantity", targetNamespace = "")
        String quantity,
        @WebParam(name = "creditCard", targetNamespace = "")
        String creditCard,
        @WebParam(name = "verifNum", targetNamespace = "")
        String verifNum,
        @WebParam(name = "buyerAddress", targetNamespace = "")
        String buyerAddress,
        @WebParam(name = "postalCode", targetNamespace = "")
        String postalCode,
        @WebParam(name = "phoneNumber", targetNamespace = "")
        String phoneNumber)
        throws IOException_Exception
    ;

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
    @Action(input = "http://juragandiskon.me.com/ConfirmationPurchase/validateAccessTokenRequest", output = "http://juragandiskon.me.com/ConfirmationPurchase/validateAccessTokenResponse", fault = {
        @FaultAction(className = MalformedURLException_Exception.class, value = "http://juragandiskon.me.com/ConfirmationPurchase/validateAccessToken/Fault/MalformedURLException"),
        @FaultAction(className = IOException_Exception.class, value = "http://juragandiskon.me.com/ConfirmationPurchase/validateAccessToken/Fault/IOException")
    })
    public String validateAccessToken(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws IOException_Exception, MalformedURLException_Exception
    ;

}