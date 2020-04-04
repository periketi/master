package com.axis1;

public class AdditionProxy implements com.axis1.Addition {
  private String _endpoint = null;
  private com.axis1.Addition addition = null;
  
  public AdditionProxy() {
    _initAdditionProxy();
  }
  
  public AdditionProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdditionProxy();
  }
  
  private void _initAdditionProxy() {
    try {
      addition = (new com.axis1.AdditionServiceLocator()).getAddition();
      if (addition != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)addition)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)addition)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (addition != null)
      ((javax.xml.rpc.Stub)addition)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.axis1.Addition getAddition() {
    if (addition == null)
      _initAdditionProxy();
    return addition;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (addition == null)
      _initAdditionProxy();
    return addition.add(i, j);
  }
  
  
}