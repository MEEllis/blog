package com.demo.project.service;

import com.demo.project.domain.Architect;
import com.demo.project.domain.Designer;
import com.demo.project.domain.Employee;
import com.demo.project.domain.Programmer;

public class TeamService {
    private static int counter = 1;
    private static final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public Programmer[] getTeam() {
        Programmer[] retTeam = new Programmer[total];
        for (int i = 0; i < total; i++) {
            retTeam[i] = team[i];
        }
        return retTeam;
    }

    public void addMember(Employee emp) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        if (!(emp instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        for (int i = 0; i < total; i++) {
            if (emp.getId() == team[i].getId()) {
                throw new TeamException("该成员已经在本开发中");
            }
        }

        Programmer perg = (Programmer) emp;

        if ("BUSY".equals(perg.getStatus().getNAME())) {
            throw new TeamException("该成员已经在本开发中");
        }

        if ("VOCATION".equals(perg.getStatus().getNAME())) {
            throw new TeamException("该成员正在休假");
        }
        int programmerCount = 0;
        int designerCount = 0;
        int architectCount = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                architectCount++;
            } else if (team[i] instanceof Designer) {
                designerCount++;
            } else if (team[i] instanceof Programmer) {
                programmerCount++;
            }
        }
        if (architectCount >= 1 && emp instanceof Architect) {
            throw new TeamException("团队至多只能一名架构师");
        } else if (designerCount >= 2 && emp instanceof Designer) {
            throw new TeamException("团队至多只能两名产品经理");
        } else if (programmerCount >= 3 && emp instanceof Programmer) {
            throw new TeamException("团队至多只能三名程序员");
        }
        team[total++] = perg;
        perg.setStatus(Status.BUSY);
        perg.setMemberId(counter++);

    }

    public void removeMember(int memberId) throws TeamException {
        for (int i = 0; i < total; i++) {
            if (memberId == team[i].getMemberId()) {
                team[i].setStatus(Status.FREE);
                for (int j = i + 1; i < total; i++) {
                    team[j - 1] = team[j];
                }
                team[total--] = null;
                break;
            }
            if (i == total - 1) {
                throw new TeamException("没有该成员");
            }

        }
    }
}
