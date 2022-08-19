package com.bridgelabz.employeewage;

public class EmployeeWage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Emplyee Wage Computation Program ");
        double empstatus = Math.floor(Math.random()*10) %2;
        if(empstatus==0) {
            System.out.println("empoyee is Prasent ");
        }else {
        System.out.println("employee is Absent ");
        }
    }
}
