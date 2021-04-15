package com.atguigu.project02.ui;

import com.atguigu.project02.CMUtility;
import com.atguigu.project02.bean.Customer;
import com.atguigu.project02.service.CustomerList;

/**
 * @author cess
 * @Description
 * @createTime 2021-04-15 5:34 下午
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    /**
     * 显示客户信息管理软件界面
     */
    public void enterMainMenu() {
        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char key = CMUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * 添加客户
     */
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    /**
     * 修改客户
     */
    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int index = -1;
        Customer customer = null;
        while (true) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else
                break;
        }

        System.out.print("姓名(" + customer.getName() + ")：");
        String name = CMUtility.readString(10, customer.getName());

        System.out.print("性别(" + customer.getGender() + ")：");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.print("年龄(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(13, customer.getPhone());

        System.out.print("邮箱(" + customer.getEmail() + ")：");
        String email = CMUtility.readString(30, customer.getEmail());

        customer = new Customer(name, gender, age, phone, email);

        boolean isflag = customerList.replaceCustomer(index - 1, customer);
        if (isflag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }
    }

    /**
     * 删除客户
     */
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int index = 0;
        Customer customer = null;
        while (true) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
                return;
            } else {
                break;
            }
        }

        System.out.print("确认是否删除(Y/N)：");
        char isFlag = CMUtility.readConfirmSelection();
        if (isFlag == 'Y') {
            boolean isDelete = customerList.deleteCustomer(index - 1);
            if (isDelete) {
                System.out.println("---------------------删除完成---------------------");
            } else {
                System.out.println("----------无法找到指定客户,删除失败--------------");
            }
        }
    }

    /**
     * 显示客户列表的操作
     */
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] allCustomers = customerList.getAllCustomers();
        if (allCustomers.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for (int i = 0; i < allCustomers.length; i++) {
                System.out.println((i + 1) + "\t" + allCustomers[i].getDetails());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
