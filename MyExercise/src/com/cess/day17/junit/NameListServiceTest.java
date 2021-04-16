package com.cess.day17.junit;

import org.junit.Test;

import com.cess.day17.domain.Employee;
import com.cess.day17.service.NameListService;
import com.cess.day17.service.TeamException;


public class NameListServiceTest {
	
	
	@Test
	public void testGetAllEmployees(){
		NameListService listService = new NameListService();
		
		Employee[] employees = listService.getAllEmployees();
		
		for(int i = 0;i < employees.length;i++){
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee(){
		int id = 2;
		NameListService listService = new NameListService();
		try {
			Employee emp = listService.getEmployee(id);
			System.out.println(emp);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
