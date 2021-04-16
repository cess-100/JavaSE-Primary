package com.cess.day17.service;

import com.cess.day17.domain.*;
import static com.cess.day17.service.Data.*;

public class NameListService {
	private Employee[] employees;
	
	public NameListService() {
		employees = new Employee[EMPLOYEES.length];
		for (int i = 0; i < employees.length; i++) {
			int type = Integer.valueOf(EMPLOYEES[i][0]);
			int id = Integer.valueOf(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.valueOf(EMPLOYEES[i][3]);
			double salary = Double.valueOf(EMPLOYEES[i][4]);

			Equipment equiment;
			double bonus;
			int stock;
			switch (type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equiment = creatEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equiment);
				break;
			case DESIGNER:
				equiment = creatEquipment(i);
				bonus = Double.valueOf(EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equiment, bonus);
				break;
			case ARCHITECT:
				equiment = creatEquipment(i);
				bonus = Double.valueOf(EMPLOYEES[i][5]);
				stock = Integer.valueOf(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equiment, bonus, stock);
				break;
			default:
				break;
			}
		}
	}

	private Equipment creatEquipment(int index) {
		int type = Integer.parseInt(EQUIPMENTS[index][0]);
		switch (type) {
		case PC:
			return new PC(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
		case NOTEBOOK:
			return new NoteBook(EQUIPMENTS[index][1], Double.parseDouble(EQUIPMENTS[index][2]));
		case PRINTER:
			return new Printer(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
		}
		return null;
	}

	public Employee[] getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) throws TeamException {
		for (Employee e : employees) {
			if (id == e.getId()) {
				return e;
			}
		}
		throw new TeamException("该员工不存在");
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
}
