package com.testutil;

public class Employee implements Comparable<Employee>{
	
	private String EmpName;
	private double EmpAge;
	private int EmpId;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public Employee(){
		
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpAge=" + EmpAge + ", EmpId="+EmpId+"]";
	}
	public Employee(String empName, double empAge,int empId) {
		super();
		EmpName = empName;
		EmpAge = empAge;
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpAge() {
		return EmpAge;
	}
	public void setEmpAge(double empAge) {
		EmpAge = empAge;
	}
	 @Override
	public int compareTo(Employee emp) {
		
		 return Integer.compare(this.EmpId,emp.EmpId);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(EmpAge);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + EmpId;
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(EmpAge) != Double.doubleToLongBits(other.EmpAge))
			return false;
		if (EmpId != other.EmpId)
			return false;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		return true;
	}

}
