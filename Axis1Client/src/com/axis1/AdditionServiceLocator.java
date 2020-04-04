/**
 * AdditionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.axis1;

public class AdditionServiceLocator extends org.apache.axis.client.Service implements com.axis1.AdditionService {

    public AdditionServiceLocator() {
    }


    public AdditionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdditionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Addition
    private java.lang.String Addition_address = "http://localhost:8086/Axis1/services/Addition";

    public java.lang.String getAdditionAddress() {
        return Addition_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdditionWSDDServiceName = "Addition";

    public java.lang.String getAdditionWSDDServiceName() {
        return AdditionWSDDServiceName;
    }

    public void setAdditionWSDDServiceName(java.lang.String name) {
        AdditionWSDDServiceName = name;
    }

    public com.axis1.Addition getAddition() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Addition_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddition(endpoint);
    }

    public com.axis1.Addition getAddition(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.axis1.AdditionSoapBindingStub _stub = new com.axis1.AdditionSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdditionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdditionEndpointAddress(java.lang.String address) {
        Addition_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.axis1.Addition.class.isAssignableFrom(serviceEndpointInterface)) {
                com.axis1.AdditionSoapBindingStub _stub = new com.axis1.AdditionSoapBindingStub(new java.net.URL(Addition_address), this);
                _stub.setPortName(getAdditionWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Addition".equals(inputPortName)) {
            return getAddition();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://axis1.com", "AdditionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://axis1.com", "Addition"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Addition".equals(portName)) {
            setAdditionEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
