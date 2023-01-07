package com.usecases;

import javax.persistence.EntityManager;
import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class InsertingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = new Employee();
		emp.setName("Kaju");
		emp.setSalary(1234567);
				
		Department dept = new Department();
		dept.setDname("HR");
		dept.setLocation("Pune");
		dept.setEmp(emp);
		
		emp.setDept(dept);
		
		
		em.getTransaction().begin();
		em.persist(dept);		
		em.getTransaction().commit();
		em.close();
		System.out.println("process is done......");

	}

}
