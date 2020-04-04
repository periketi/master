package maths;

public class OperationsProxy implements maths.Operations {
  private String _endpoint = null;
  private maths.Operations operations = null;
  
  public OperationsProxy() {
    _initOperationsProxy();
  }
  
  public OperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initOperationsProxy();
  }
  
  private void _initOperationsProxy() {
    try {
      operations = (new maths.OperationsServiceLocator()).getOperations();
      if (operations != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)operations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)operations)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (operations != null)
      ((javax.xml.rpc.Stub)operations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public maths.Operations getOperations() {
    if (operations == null)
      _initOperationsProxy();
    return operations;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (operations == null)
      _initOperationsProxy();
    return operations.add(i, j);
  }
  
  public int sub(int i, int j) throws java.rmi.RemoteException{
    if (operations == null)
      _initOperationsProxy();
    return operations.sub(i, j);
  }
  
  
}