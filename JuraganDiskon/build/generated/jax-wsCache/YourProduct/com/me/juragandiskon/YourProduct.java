
package com.me.juragandiskon;

import java.util.List;
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
@WebService(name = "YourProduct", targetNamespace = "http://juragandiskon.me.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface YourProduct {


    /**
     * 
     * @param userName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.GetProductsResponse")
    @Action(input = "http://juragandiskon.me.com/YourProduct/getProductsRequest", output = "http://juragandiskon.me.com/YourProduct/getProductsResponse")
    public List<String> getProducts(
        @WebParam(name = "user_name", targetNamespace = "")
        String userName);

    /**
     * 
     * @param productId
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editProduct", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.EditProduct")
    @ResponseWrapper(localName = "editProductResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.EditProductResponse")
    @Action(input = "http://juragandiskon.me.com/YourProduct/editProductRequest", output = "http://juragandiskon.me.com/YourProduct/editProductResponse")
    public String editProduct(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "product_id", targetNamespace = "")
        int productId);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteProduct", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.DeleteProduct")
    @ResponseWrapper(localName = "deleteProductResponse", targetNamespace = "http://juragandiskon.me.com/", className = "com.me.juragandiskon.DeleteProductResponse")
    @Action(input = "http://juragandiskon.me.com/YourProduct/deleteProductRequest", output = "http://juragandiskon.me.com/YourProduct/deleteProductResponse")
    public String deleteProduct();

}
