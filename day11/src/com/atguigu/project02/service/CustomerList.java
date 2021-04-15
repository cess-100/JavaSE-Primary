package com.atguigu.project02.service;

import com.atguigu.project02.bean.Customer;

/**
 * @author cess
 * @Description
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
