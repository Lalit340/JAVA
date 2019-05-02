package com.Lp.collection;

public class Employee {
    private int eno;  
	private String ename;
	private String dept;
	private double sal;

	
	
	public Employee(int eno, String  ename, String dept, double sal) {
		System.out.println("Employee::4-param constructor()");
		this.eno = eno;
		this.ename=ename;
		this.dept = dept;
		this.sal = sal;
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee) {
			Employee e=(Employee) obj;
//			System.out.println("the Employee sal is::"+this.sal);
			return (this.eno==e.eno) && (this.dept==e.dept);
	
		}
		else
			System.out.println("Record not found");
			return false;
		
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal +"]";
	}



}   
