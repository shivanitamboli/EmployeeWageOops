package com.bridgelabz;

public class EmployeeWage implements ComputeWage{
    public static final int isPartTime=0;
    public static final int isFullTime=1;
    private int numOfCompany;
    private CompanyEmpWage empWageArray[];
    public EmployeeWage() {
        empWageArray=new CompanyEmpWage[5];
    }
    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
        empWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
        numOfCompany++;
    }
    public void computeEmpWage() {
        for(int i=0;i<numOfCompany;i++) {
            empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
            System.out.println(empWageArray[i]);
        }

    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHours=0, totalEmpHours=0, totalWorkingDays=0;
        while(totalEmpHours<=companyEmpWage.maximumHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
            int check=(int)(Math.floor(Math.random()*10)%2);
            switch(check){
                case isPartTime:
                    empHours=4;
                    break;
                case isFullTime:
                    empHours=8;
                    break;
                default :
                    empHours=0;
            }
            totalEmpHours+=empHours;
            totalWorkingDays+=1;
        }
        return totalEmpHours * companyEmpWage.empRatePerHour;
    }
    public static void main(String args[]) {
        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.addCompanyEmpWage("Dmart", 17, 20, 125);
        employeeWage.addCompanyEmpWage("Reliance", 25, 21, 70);
        employeeWage.computeEmpWage();
    }
}