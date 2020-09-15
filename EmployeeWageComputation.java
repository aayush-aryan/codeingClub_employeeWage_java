package org.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
    static int wagePerHour=20;
	static int isPresent=1;
	static int isPartTime = 2;
	static int empHrs;
	static int empWage;

	public static void main(String[] args) {
	     
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
			empWage=empHrs*wagePerHour;
			System.out.println("Employee wage is :"+ empWage);

	}

}
