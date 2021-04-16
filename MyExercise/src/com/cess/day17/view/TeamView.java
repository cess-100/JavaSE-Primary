package com.cess.day17.view;

import java.util.Scanner;

import com.cess.day17.domain.Architect;
import com.cess.day17.domain.Designer;
import com.cess.day17.domain.Employee;
import com.cess.day17.domain.Programmer;
import com.cess.day17.service.NameListService;
import com.cess.day17.service.TeamException;
import com.cess.day17.service.TeamService;

public class TeamView { 
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	public void enterMainMenu() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		char menuSelection = 0;
		while (flag) {
			listAllEmployees();
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			menuSelection = TSUtility.readMenuSelection();
			System.out.println();
			switch (menuSelection) {
			case '1':
				listTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("确认是否退出(Y/N)：");
				char confirmSelection = TSUtility.readConfirmSelection();
				if (confirmSelection == 'Y') {
					flag = false;
				}
				break;
			}
		}
	}

	private void listAllEmployees() {
		Employee[] employees = listSvc.getAllEmployees();
		System.out.println("-----------------------------------开发团队调度软件------------------------------------\n");
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] instanceof Architect) {
				System.out.println(((Architect) (employees[i])).toString());
			} else if (employees[i] instanceof Designer) {
				System.out.println(((Designer) (employees[i])).toString());
			} else if (employees[i] instanceof Programmer) {
				System.out.println(((Programmer) (employees[i])).toString());
			} else {
				System.out.println(employees[i].toString());
			}
		}
		System.out.println("-------------------------------------------------------------------------------------");
	}

	private void listTeam() {
		System.out.println("--------------------团队成员列表---------------------\n");
		Programmer[] team = teamSvc.getTeam();
		if (team == null || team.length == 0) {
			System.out.println("开发团队目前没有成员！");
		} else {
			System.out.println("TDI/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
		}
		for (int i = 0; i < team.length; i++) {
			if (team[i] instanceof Architect) {
				System.out.println(team[i].getMemberId() + "/" + ((Architect) (team[i])).getInfo());
			} else if (team[i] instanceof Designer) {
				System.out.println(team[i].getMemberId() + "/" + ((Designer) (team[i])).getInfo());
			} else if (team[i] instanceof Programmer) {
				System.out.println(team[i].getMemberId() + "/" + ((Programmer) (team[i])).getInfo());
			}
		}
		System.out.println("-----------------------------------------------------");
		TSUtility.readReturn();
	}

	private void addMember() {
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		try { 
			Employee e = listSvc.getEmployee(id);
			teamSvc.addMember(e);
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失败，原因：" + e.getMessage());
		} finally {
			TSUtility.readReturn();
		}
	}

	private void deleteMember() {
		System.out.println("---------------------删除成员---------------------");
		System.out.print("请输入要删除员工的TID：");
		int tid = TSUtility.readInt();
		System.out.println("确认是否删除(Y/N)：");
		char confirmSelection = TSUtility.readConfirmSelection();
		try {
			if (confirmSelection == 'Y') {
				teamSvc.removeMember(tid);
				System.out.println("删除成功");
			}
		} catch (Exception e) {
			System.out.println("删除失败，原因：" + e.getMessage());
		}
		TSUtility.readReturn();
	}

	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}

}
