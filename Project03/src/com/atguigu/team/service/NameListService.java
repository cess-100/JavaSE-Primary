package com.atguigu.team.service;

import com.atguigu.team.domain.*;

import static com.atguigu.team.service.Data.*;

public class NameListService {
    private Employee[] employees;//存储Data中的数据

    /**
     * 构造器，将Data的数据存入数组Employee中
     */
    public NameListService() {
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            // 获取通用的属性
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            //
            Equipment eq;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    eq = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, eq);
                    break;
                case DESIGNER:
                    eq = createEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, eq, bonus);
                    break;
                case ARCHITECT:
                    eq = createEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, eq, bonus,
                            stock);
                    break;
            }
        }
    }

    /**
     * 从Data中获取Equipment信息
     *
     * @param index 索引
     * @return 返回Equipment对象
     */
    private Equipment createEquipment(int index) {
        int type = Integer.parseInt(EQIPMENTS[index][0]);
        switch (type) {
            case PC:
                return new PC(EQIPMENTS[index][1], EQIPMENTS[index][2]);
            case NOTEBOOK:
                int price = Integer.parseInt(EQIPMENTS[index][2]);
                return new NoteBook(EQIPMENTS[index][1], price);
            case PRINTER:
                return new Printer(EQIPMENTS[index][1], EQIPMENTS[index][2]);
        }
        return null;
    }

    /**
     * 获取当前所有员工
     *
     * @return 所有员工对象数组
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 获取指定index上的员工信息
     *
     * @param id 数组Employee指定位置
     * @return 返回Employee对象
     * @throws TeamException 员工不存在时抛出异常
     */
    public Employee getEmployee(int id) throws TeamException {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        throw new TeamException("找不到指定员工");
    }
}
