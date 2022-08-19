package com.bridgelabz.employeewage;

public class EmployeeWage
{
    static final int wage_per_houre = 20;
    static final int full_day = 8;
    static final int part_time_houre = full_day/2;
   static void dailywage(){
       System.out.println("Employee Wage is "+ wage_per_houre*full_day);
   }
   static void parttimewage(){
       System.out.println("Employee Part time wage os "+ wage_per_houre*part_time_houre);
   }
    public static void main(String[] args) {
        System.out.println("Welcome To Emplyee Wage Computation Program ");
        double empstatus = Math.floor(Math.random() * 10) % 2;
        switch (empstatus){
        case 1:
        System.out.println("empoyee is Prasent ");
        break;
        case 2:
        System.out.println("employee is Absent ");
        break;
         }
        dailywage();
        parttimewage();
    }
}
