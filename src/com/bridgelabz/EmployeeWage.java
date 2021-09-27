package com.bridgelabz;

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static int computeEmpWage(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth) {

        //variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0: // Employee is absent
                    empHrs = 0;
                case 1: // FullTime Employee
                    empHrs = 8;
                    break;
                case 2: // PartTime Employee
                    empHrs = 4;
                    break;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Wages For Company : " +company+ " is :" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("Dmart", 20, 2, 10);
        computeEmpWage("Reliance", 10, 4, 20);
    }
}

