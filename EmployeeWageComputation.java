package org.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
    static int wagePerHour=20;
	static int isPresent=1;
	static int empHrs=0;
	static int empWage=0;

	public static void main(String[] args) {
	     
		  double randomValue=Math.floor(Math.random()*10)%2;
			if (randomValue == isPresent)
			{
				empHrs=8;
			}
			else
			{
				empHrs=0;
			}
			empWage=empHrs*wagePerHour;
			System.out.println("Employee wage is :"+ empWage);

	}

}
