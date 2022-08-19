package com.bridgelabz.employeewage;

public class EmployeeWage<wage_per_houre>
{
    static final int wage_per_houre = 20;
    static final int full_day = 8;
    static void dailywage(){
        System.out.println("Employee Wage is "+ wage_per_houre*full_day);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Emplyee Wage Computation Program ");
        double empstatus = Math.floor(Math.random()*10) %2;
        if(empstatus==0) {
            System.out.println("empoyee is Prasent ");
        }else {
        System.out.println("employee is Absent ");
        }
        dailywage();
    }
}
