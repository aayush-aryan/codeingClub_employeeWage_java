package org.bridgelabz.employeewagecomputation;

import java.util.ArrayList;

public class EmployeeWageComputation{
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String Company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	
	
public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		
		Company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	private int computeEmpWage()
	{
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpWage =0;

		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int randomValue = (int) Math.floor(Math.random()*10)%3;
			switch (randomValue) {
					case IS_PART_TIME:
						empHrs=4;
						break;
					case IS_FULL_TIME:
						empHrs=8;
						break;
					default:
						empHrs=0;
			}
			totalEmpHrs += empHrs;
		}
		totalEmpWage =totalEmpHrs*empRatePerHour;
		return totalEmpWage;
	}
	public static void main(String [] args)
	{
		EmployeeWageComputation samsung = new EmployeeWageComputation("SAMSUNG", 30, 20,100);
		EmployeeWageComputation apple = new EmployeeWageComputation("Apple", 130, 20,100);
		ArrayList<Object> arraylist = new ArrayList<Object>();
		arraylist.add(samsung.Company);
		arraylist.add(samsung.computeEmpWage());
		arraylist.add(apple.Company);
		arraylist.add(apple.computeEmpWage());
		System.out.println(arraylist);
		
	}
	
}