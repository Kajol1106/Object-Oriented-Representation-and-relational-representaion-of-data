package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//this will be child entity class. It doesn't have any information about parent entity
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department dept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int empId, String name, int salary, Department dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	
	
	public Employee(String name, int salary, Department dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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

	
	
	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	
	
	
}