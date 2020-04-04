/**
 * OperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package maths;

public class OperationsServiceLocator extends org.apache.axis.client.Service implements maths.OperationsService {

    public OperationsServiceLocator() {
    }


    public OperationsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OperationsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Operations
    private java.lang.String Operations_address = "http://localhost:11878/Axis2/services/Operations";

    public java.lang.String getOperationsAddress() {
        return Operations_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OperationsWSDDServiceName = "Operations";

    public java.lang.String getOperationsWSDDServiceName() {
        return OperationsWSDDServiceName;
    }

    public void setOperationsWSDDServiceName(java.lang.String name) {
        OperationsWSDDServiceName = name;
    }

    public maths.Operations getOperations() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Operations_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOperations(endpoint);
    }

    public maths.Operations getOperations(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            maths.OperationsSoapBindingStub _stub = new maths.OperationsSoapBindingStub(portAddress, this);
            _stub.setPortName(getOperationsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOperationsEndpointAddress(java.lang.String address) {
        Operations_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (maths.Operations.class.isAssignableFrom(serviceEndpointInterface)) {
                maths.OperationsSoapBindingStub _stub = new maths.OperationsSoapBindingStub(new java.net.URL(Operations_address), this);
                _stub.setPortName(getOperationsWSDDServiceName());
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
        if ("Operations".equals(inputPortName)) {
            return getOperations();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://maths", "OperationsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://maths", "Operations"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Operations".equals(portName)) {
            setOperationsEndpointAddress(address);
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
