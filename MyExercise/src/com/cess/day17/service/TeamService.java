package com.cess.day17.service;

import com.cess.day17.domain.Architect;
import com.cess.day17.domain.Designer;
import com.cess.day17.domain.Employee;
import com.cess.day17.domain.Programmer;

public class TeamService {
	private static int count = 1;
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total;

	public TeamService() {
	}

	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for (int i = 0; i < total; i++) {
			team[i] = this.team[i];
		}
		return team;
	}

	public void addMember(Employee e) throws TeamException {
		if (total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		Programmer p = (Programmer) e;
		if (isExist(p)) {
			throw new TeamException("该员工已在本开发团队中");
		}
		if (p.getStatus().getNAME().equals("BUSY")) {
			throw new TeamException("该员工已是某团队成员");
		} else if (p.getStatus().getNAME().equals("VACATION")) {
			throw new TeamException("该员正在休假，无法添加");
		}
		int numOfArch = 0;
		int numOfDsgn = 0;
		int numOfPrgr = 0;
		for (int i = 0; i < total; i++) {
			if (team[i] instanceof Architect)
				numOfArch++;
			else if (team[i] instanceof Designer)
				numOfDsgn++;
			else
				numOfPrgr++;
		}
		if (e instanceof Architect) {
			if (numOfArch >= 1)
				throw new TeamException("团队中至多只能有一名架构师");
		} else if (e instanceof Designer) {
			if (numOfDsgn >= 2)
				throw new TeamException("团队中至多只能有两名设计师");
		} else if (e instanceof Programmer)
			if (numOfPrgr >= 3)
				throw new TeamException("团队中至多只能有三名程序员");
		p.setStatus(Status.BUSY);
		p.setMemberId(count++);
		team[total++] = p;
	}

	public void removeMember(int memberId) throws TeamException {
		int i = 0;
		for (; i < total; i++) {
			if (team[i].getMemberId() == memberId) {
//				team[i].setMemberId(0);
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		if (i == total) {
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}
		for (int j = i + 1; j < total; j++) {
			team[j - 1] = team[j];
		}
		team[--total] = null;
	}

	private boolean isExist(Programmer p) {
		for (int i = 0; i < total; i++) {
			if (p.getId() == team[i].getId()) {
				return true;
			}
		}
		return false;
	}
}
