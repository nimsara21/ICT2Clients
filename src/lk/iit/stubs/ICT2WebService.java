
package lk.iit.stubs;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICT2WebService", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ICT2WebService {


    /**
     * 
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isConnected", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.IsConnected")
    @ResponseWrapper(localName = "isConnectedResponse", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.IsConnectedResponse")
    @Action(input = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/isConnectedRequest", output = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/isConnectedResponse")
    public Integer isConnected();

    /**
     * 
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addDoubleOnServer", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.AddDoubleOnServer")
    @ResponseWrapper(localName = "addDoubleOnServerResponse", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.AddDoubleOnServerResponse")
    @Action(input = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/addDoubleOnServerRequest", output = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/addDoubleOnServerResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/addDoubleOnServer/Fault/Exception")
    })
    public void addDoubleOnServer(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLargestDoubleOnServer", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.GetLargestDoubleOnServer")
    @ResponseWrapper(localName = "getLargestDoubleOnServerResponse", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.GetLargestDoubleOnServerResponse")
    @Action(input = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/getLargestDoubleOnServerRequest", output = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/getLargestDoubleOnServerResponse")
    public Double getLargestDoubleOnServer();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Double
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "safeDivide", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.SafeDivide")
    @ResponseWrapper(localName = "safeDivideResponse", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.SafeDivideResponse")
    @Action(input = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/safeDivideRequest", output = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/safeDivideResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/safeDivide/Fault/Exception")
    })
    public Double safeDivide(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "amoamo", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.Amoamo")
    @ResponseWrapper(localName = "amoamoResponse", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.AmoamoResponse")
    @Action(input = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/amoamoRequest", output = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/amoamoResponse")
    public Integer amoamo();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://ict2webapplicationtry.ict.iit.lk/", className = "lk.iit.stubs.DivideResponse")
    @Action(input = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/divideRequest", output = "http://ict2webapplicationtry.ict.iit.lk/ICT2WebService/divideResponse")
    public Double divide(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1);

}