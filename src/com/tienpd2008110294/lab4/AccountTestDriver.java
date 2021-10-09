/*
* created date: Oct 08, 2021
*author: tien
*/
package com.tienpd2008110294.lab4;

public class AccountTestDriver {
    public static void main(String[] args) {
        Account account;

        account = new Account(2008110255, 500000);
        account.showData();
        account.deposit(500000);
        account.showData();
        account.withdraw(100000);
        account.showData();

        Customer customer;
        customer = new Customer();

        customer.getName();
        customer.getAddress();

        Employee employee;
        employee = new Employee();
        employee.getName();
        employee.getSalary();
    }

}
