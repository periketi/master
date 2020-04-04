/**
 * OperationsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package maths;

public interface OperationsService extends javax.xml.rpc.Service {
    public java.lang.String getOperationsAddress();

    public maths.Operations getOperations() throws javax.xml.rpc.ServiceException;

    public maths.Operations getOperations(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
