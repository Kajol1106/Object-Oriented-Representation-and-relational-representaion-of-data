package com.usecases;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class FetchDataUsingDepartmentID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		Department dept = em.find(Department.class, 1);
		Employee emp = dept.getEmp();
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		em.close();
		System.out.println("done....");
	}

}
