package maths;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OperationsServiceLocator locator = new OperationsServiceLocator();
		Operations oper = locator.getOperations();
		int sub= oper.sub(30, 20);
		int sub1= oper.add(30, 20);
		System.out.println(sub);
		System.out.println(sub1);

	}

}
