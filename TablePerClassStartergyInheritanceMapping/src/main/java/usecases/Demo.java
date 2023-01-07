package usecases;

import javax.persistence.EntityManager;

import com.utility.EMUtil;

import model.ContractualEmployee;
import model.Employee;
import model.SalaryEmployee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = new Employee();
		emp.setName("Kaju");
		
		ContractualEmployee cemp = new ContractualEmployee();
		cemp.setCostPerDay(1000);
		cemp.setName("Ram");
		cemp.setNoOfWorkingDays(10);
		
		SalaryEmployee semp = new SalaryEmployee();
		semp.setSalary(23456);
		semp.setName("Divya");
		
		
		em.getTransaction().begin();
		em.persist(emp);
		em.persist(semp);
	    em.persist(cemp);
	    em.getTransaction().commit();
	    em.close();
	    System.out.println("Task done....");
	}

}
