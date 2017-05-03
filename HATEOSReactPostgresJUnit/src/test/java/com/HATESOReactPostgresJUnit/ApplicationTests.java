package com.HATESOReactPostgresJUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.junit.runners.MethodSorters;


import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.howardhardy.payroll.Employee;
import com.howardhardy.payroll.EmployeeRepository;
import com.howardhardy.payroll.HATESOReactPostgresJUnitApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HATESOReactPostgresJUnitApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
    TransactionalTestExecutionListener.class,
    DbUnitTestExecutionListener.class})
public class ApplicationTests {

	@Autowired
	private EmployeeRepository repository;
	Employee howard = new Employee("Howard", "Hardy", "Developer");
	
	@Test
	public void aClearDatabase() {
		repository.deleteAll();
		
		if(repository.count() == 0){
			return;
		}
		else
		{
			fail();
		}
	}
	
	@Test
	public void bAddThreeUsers() {
		repository.save(new Employee("Joel", "Spolsky", "Software Engineer"));
		repository.save(howard);
		repository.save(new Employee("Noam", "Chomsky", "Linguist"));
		
		
		if(repository.count() == 3){
			return;
		}
		else
		{
			fail();
		}
	}
	
	@Test
	public void cRemoveMyself() {
		
		//repository.delete(howard);
		//Doesn't work for some reason, so I've had to get all of the data
		//then manually get the ID so that it could be deleted that way
		
		ArrayList<Employee> al = (ArrayList<Employee>) repository.findAll();
		Iterator i = al.iterator();
		Employee emp = (Employee) i.next();
		String s;
		
		while(i.hasNext()){
			s = emp.toString();
			if(s.contains("firstName=Howard, lastName=Hardy, description=Developer")){
				//Takes the ID from the string
				String idString = s.substring(12, s.indexOf("f")-2);
				//Then deletes that record
				repository.delete(Long.valueOf(idString));
				break;
			}
			emp = (Employee) i.next();
		}
		
		//Get the updated array list
		al = (ArrayList<Employee>) repository.findAll();
		//Second iterator to check that it has been removed
		Iterator j = al.iterator();
		emp = (Employee) j.next();
		
		while(j.hasNext()){
			s = emp.toString();
			if(s.contains("firstName=Howard, lastName=Hardy, description=Developer"))
				fail();
			emp = (Employee) j.next();
		}
		
	}
}
