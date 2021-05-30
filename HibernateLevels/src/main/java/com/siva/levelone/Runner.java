package com.siva.levelone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Runner {

	public static void main(String[] args) {

		EmployeeFullName empname_1 = new EmployeeFullName();
		empname_1.setEmpFirstName("Ananda");
		empname_1.setEmpMiddleName("Padmanaban");
		empname_1.setEmpLastName("Vadvur");

		/*
		 * EmployeeFullName empname_2 = new EmployeeFullName();
		 * empname_2.setEmpFirstName("Bala"); empname_2.setEmpMiddleName("Sundar");
		 * empname_2.setEmpLastName("Porur");
		 */

		Department dept_1 = new Department();
		dept_1.setDepno(10);
		dept_1.setDname("Manufactoring");

		Department dept_2 = new Department();
		dept_2.setDepno(20);
		dept_2.setDname("Sales");

		Employee emp_1 = new Employee();
		// to insert records only
		emp_1.setEmpid(101);
		emp_1.setEmpname(empname_1);
		emp_1.setSalary(10100);
		emp_1.setEmp_Designation("Manager");
		/* emp.setEmp_Dept(dept); */ // for one to one
		emp_1.getEmp_Dept().add(dept_1);
		emp_1.getEmp_Dept().add(dept_2);

		/*
		 * Employee emp_2 = new Employee(); // to insert records only
		 * emp_2.setEmpid(102); emp_2.setEmpname(empname_2); emp_2.setSalary(20200);
		 * emp_2.setEmp_Designation("Officer"); emp.setEmp_Dept(dept); //for one to one
		 * emp_2.getEmp_Dept().add(dept_2);
		 */

		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Department.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(emp_1);
		session.save(dept_1);
		//session.save(emp_2);
		session.save(dept_2);

		/* emp = (Employee) session.get(Employee.class, 101); */

		tx.commit();

		// System.out.println(emp);

	}

}
