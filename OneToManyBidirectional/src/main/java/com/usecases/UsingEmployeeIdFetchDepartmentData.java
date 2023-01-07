package com.usecases;

import java.util.List;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class UsingEmployeeIdFetchDepartmentData {
	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		Employee emp = em.find(Employee.class, 2);
		Department dept = emp.getDept();
		System.out.println(dept.getDeptId());
		System.out.println(dept.getDname());
		System.out.println(dept.getLocation());
		//System.out.println(dept);
		em.close();
		System.out.println("Done...");
	}
}
