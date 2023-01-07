package com.usecases;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.model.Department;
import com.model.Employee;
import com.utility.EMUtil;

public class UsingDepartmentIdFetEmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		Department dept = em.find(Department.class, 3);
		List<Employee> employees = dept.getEmployees();
		employees.forEach(e ->{
			System.out.println("Name : "+e.getName());
			System.out.println("ID : "+e.getEmpId());
			System.out.println("Salary : "+e.getSalary());
			System.out.println("====================================");
		});
		
		em.close();
		System.out.println("done...");
	}

}
