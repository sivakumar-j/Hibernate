package com.siva.levelone;

import javax.persistence.Embeddable;

@Embeddable // to add in existing table
public class EmployeeFullName {
	
	private String EmpFirstName;
	private String EmpMiddleName;
	private String EmpLastName;
	public String getEmpFirstName() {
		return EmpFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		EmpFirstName = empFirstName;
	}
	public String getEmpMiddleName() {
		return EmpMiddleName;
	}
	public void setEmpMiddleName(String empMiddleName) {
		EmpMiddleName = empMiddleName;
	}
	public String getEmpLastName() {
		return EmpLastName;
	}
	public void setEmpLastName(String empLastName) {
		EmpLastName = empLastName;
	}

}
