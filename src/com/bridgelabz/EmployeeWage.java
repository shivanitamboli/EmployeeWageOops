package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
        //Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int  ENP_RATE_PER_HOUR = 20;
        // Variables
        int emHrs = 0;
        int empWage = 0;
        System.out.println("Welcome to Employee Wage");
        // computation
        double empCheck = Math.floor(Math.random()* 10) % 3;
        // Using random class to Get random number
        if (empCheck == IS_PART_TIME){
            emHrs = 4;
        }else if (empCheck == IS_FULL_TIME){
            emHrs = 8;
        }else {
            emHrs = 0;
        }
        empWage = emHrs * ENP_RATE_PER_HOUR;
        System.out.println("Employee Wage " + empWage);
    }
}

