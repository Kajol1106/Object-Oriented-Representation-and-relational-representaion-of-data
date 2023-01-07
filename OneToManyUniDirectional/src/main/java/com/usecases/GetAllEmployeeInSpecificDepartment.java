package com.usecases;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.model.Employee;
import com.utility.EMUtil;

public class GetAllEmployeeInSpecificDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
//		String jpql = "select employees from Department where dname='HR'";
		String jpql = "select employees from Department where dname= :dn";
		Query q = em.createQuery(jpql);
		q.setParameter("dn", "HR");
		List<Employee> allEmps = q.getResultList();
		System.out.println(allEmps);
		System.out.println("done...");
		
	}

}
