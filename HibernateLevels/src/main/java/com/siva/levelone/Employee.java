package com.siva.levelone;

import java.util.ArrayList;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import java.util.List;


@Entity
@Table(name="T_Employee")
public class Employee {
	
	@Id
	private int Empid;
	private EmployeeFullName Empname;
	@Column(name="Emp_Salary")
	private int Salary;
	@Transient
	private String Emp_Designation;
	/*
	 * @OneToOne private Department Emp_Dept;
	 */
	@OneToMany
	private List<Department> Emp_Dept = new ArrayList<Department>();
	
	
	
	public int getEmpid() {
		return Empid;
	}



	public void setEmpid(int empid) {
		Empid = empid;
	}



	public EmployeeFullName getEmpname() {
		return Empname;
	}



	public void setEmpname(EmployeeFullName empname) {
		Empname = empname;
	}



	public int getSalary() {
		return Salary;
	}



	public void setSalary(int salary) {
		Salary = salary;
	}



	public String getEmp_Designation() {
		return Emp_Designation;
	}



	public void setEmp_Designation(String emp_Designation) {
		Emp_Designation = emp_Designation;
	}



	public List<Department> getEmp_Dept() {
		return Emp_Dept;
	}



	public void setEmp_Dept(List<Department> emp_Dept) {
		Emp_Dept = emp_Dept;
	}



	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Salary=" + Salary + ", Emp_Designation="
				+ Emp_Designation + "]";
	}
	

	
	

}
