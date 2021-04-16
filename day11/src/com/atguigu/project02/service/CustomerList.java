package com.atguigu.project02.service;

import com.atguigu.project02.bean.Customer;

/**
 * 1.至少独立完成一遍以上的项目代码
 *
 * 2.积累完成项目的过程中常见的bug的调试
 *     方式一：应看，必要时添加输出语句
 *     方式二：debug
 *
 * 3.捋顺思路,强化逻辑
 *
 * 4.对象、数组等内存结构的解析
 *
 * 5.遵守编码的规范,标识符的命名规范等
 *
 * 6.在类前,方法前,方法内具体逻辑的实现步骤等添加必要的注释
 *     类、方法、属性前：文档注释
 *     逻辑步骤：单行、多行注释
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 创建CustomerList对象
     */
    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }

    /**
     * 将制定的客户添加数组中
     *
     * @param customer
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length)
            return false;
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改制定索引位置的客户信息
     *
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置的客户
     *
     * @param index
     * @return true：删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有的客户信息
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 返回指定索引位置的客户信息
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户数量
     */
    public int getTotal() {
        return total;
    }
}
