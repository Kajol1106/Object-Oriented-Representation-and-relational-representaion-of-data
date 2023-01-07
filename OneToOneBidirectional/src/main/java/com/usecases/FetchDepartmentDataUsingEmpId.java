package com.usecases;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class FetchDepartmentDataUsingEmpId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = em.find(Employee.class, 2);
		Department dept = emp.getDept();
		System.out.println(dept.getDeptId());
		System.out.println(dept.getDname());
		System.out.println(dept.getLocation());
		em.close();
		System.out.println("Task is done...");
	}

}
