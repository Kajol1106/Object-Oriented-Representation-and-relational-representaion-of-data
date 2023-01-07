package com.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class UsingEmployeeGetDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = em.find(Employee.class, 4);
		List<Department> depts = emp.getDepartments();
		depts.forEach(d-> {
			System.out.println(d.getDeptId());
			System.out.println(d.getDname());
			System.out.println(d.getLocation());
			System.out.println("===========================");
		});
		em.close();
		System.out.println("done...");
	}

}
