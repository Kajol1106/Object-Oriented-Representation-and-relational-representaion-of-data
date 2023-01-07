package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private int salary;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "employees")
	private List<Department> departments = new ArrayList<>();
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int empId, String name, int salary, List<Department> departments) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.departments = departments;
	}


	public Employee(String name, int salary, List<Department> departments) {
		super();
		this.name = name;
		this.salary = salary;
		this.departments = departments;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public List<Department> getDepartments() {
		return departments;
	}


	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", departments=" + departments
				+ "]";
	}

	
}