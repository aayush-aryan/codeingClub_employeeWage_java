package org.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
    static int wagePerHour=20;
	static int isPresent=1;
	static int isPartTime = 2;
	static int totalWorkingDays=20;
	static int empHrs;
	static int empWage;
	static int totalEmpHrs=0;

	public static void main(String[] args) {
		
	    for (int day= 0; day < totalWorkingDays; day++) {
			
		
		  double randomValue=Math.floor(Math.random()*10)%3;
			switch ((int)randomValue) {
			case 1:
				empHrs=8;
				break;
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			
			totalEmpHrs=totalEmpHrs+empHrs;
			
	    }
	    
			empWage=totalEmpHrs*wagePerHour;
			System.out.println("Total working hours :" +totalEmpHrs+"hrs");
			System.out.println("Employee wage is :"+ empWage);

	}

}
