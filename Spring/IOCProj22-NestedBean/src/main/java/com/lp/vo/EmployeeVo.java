package com.lp.vo;

public class EmployeeVo {
	private String sno;
	private String empno;
	private String sname;
	private String job;
	private String salary;
	private String deptno;
	
	public String getSno() {
		return sno;
	}
	public String getEmpno() {
		return empno;
	}
	public String getSname() {
		return sname;
	}
	public String getJob() {
		return job;
	}
	public String getSalary() {
		return salary;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmployeeVo [sno=" + sno + ", empno=" + empno + ", sname=" + sname + ", job=" + job + ", salary="
				+ salary + ", deptno=" + deptno + "]";
	}
	
}
