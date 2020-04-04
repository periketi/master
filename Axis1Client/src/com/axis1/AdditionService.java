/**
 * AdditionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.axis1;

public interface AdditionService extends javax.xml.rpc.Service {
    public java.lang.String getAdditionAddress();

    public com.axis1.Addition getAddition() throws javax.xml.rpc.ServiceException;

    public com.axis1.Addition getAddition(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
