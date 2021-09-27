package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
        //Constants
        int IS_FULL_TIME = 1;
        int  ENP_RATE_PER_HOUR = 20;
        // Variables
        int emHrs = 0;
        int empWage = 0;
        System.out.println("Welcome to Employee Wage");
        // computation
        double empCheck = Math.floor(Math.random()* 10) %2;
        // Using random class to Get random number
        if (empCheck == IS_FULL_TIME){ //echEmp get 1 when first condition is true and showing employee present
            emHrs = 8;
        }else {
            emHrs = 0;
        }
        empWage = emHrs * ENP_RATE_PER_HOUR;
        System.out.println("Employee Wage " + empWage);

}
}
