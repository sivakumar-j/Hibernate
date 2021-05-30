package com.siva.levelone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Department {
	
	@Id
	private int Depno;
	private String Dname;

	
	public int getDepno() {
		return Depno;
	}
	public void setDepno(int depno) {
		Depno = depno;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	
	

}
