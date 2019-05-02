package com.lp.bo;


public class EmployeeBO {
    
	private int empno;
	private String ename;
    private String job;
    private  double salary;
    private  int    deptno;
    
      public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public double getSalary() {
		return salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmployeeBO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", deptno="
				+ deptno + "]";
	}

}
