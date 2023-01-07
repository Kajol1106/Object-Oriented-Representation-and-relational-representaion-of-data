package com.usecases;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class InsertRecordAllReadyPresentedDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		Department dept = em.find(Department.class, 1);
		Employee emp = new Employee();
		emp.setName("Raj");
		emp.setSalary(7890);
		em.getTransaction().begin();
		dept.getEmployees().add(emp);
		em.getTransaction().commit();
		em.close();
		System.out.println("done...");
	}

}
