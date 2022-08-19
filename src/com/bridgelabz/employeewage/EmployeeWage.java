package com.bridgelabz.employeewage;

public class EmployeeWage
{
        static final int wage_per_houre = 20;
        static final int full_day = 8;
        static final int part_time_houre = full_day/2;
        static final int working_day_Per_month = 20;

        public static void main(String[] args)
        {
            System.out.println("Welcome To Emplyee Wage Computation Program ");
            int EmpIsPrasentFullTime = 1;
            int EmpIsPrasentHalfTime = 2;

            double empstatus = Math.floor(Math.random() * 10) % 2;
            if (empstatus == EmpIsPrasentFullTime)
            {
                System.out.println("Employee full day Wage " + wage_per_houre * full_day);
            } else if(empstatus==EmpIsPrasentHalfTime)
            {
                System.out.println("Employee Part time wage is "+ wage_per_houre*part_time_houre);
            }
            else{
                System.out.println("Employee is absent");
            }

        }}

