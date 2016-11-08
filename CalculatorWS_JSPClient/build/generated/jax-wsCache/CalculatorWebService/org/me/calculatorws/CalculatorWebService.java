
package org.me.calculatorws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWebService", targetNamespace = "http://calculatorws.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://calculatorws.me.org/", className = "org.me.calculatorws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://calculatorws.me.org/", className = "org.me.calculatorws.HelloResponse")
    @Action(input = "http://calculatorws.me.org/CalculatorWebService/helloRequest", output = "http://calculatorws.me.org/CalculatorWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculatorws.me.org/", className = "org.me.calculatorws.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculatorws.me.org/", className = "org.me.calculatorws.AddResponse")
    @Action(input = "http://calculatorws.me.org/CalculatorWebService/addRequest", output = "http://calculatorws.me.org/CalculatorWebService/addResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

}
