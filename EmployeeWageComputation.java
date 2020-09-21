package org.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
	
	  static int wagePerHour=20;
		static int isPresent=1;
		static int isPartTime = 2;
		static int totalWorkingDays=20;
		static int totalWorkingHrs=100;
		static int empHrs;
		static int empDay=0;
		static int empWage;
		static int totalEmpHrs=0;

		  

		public static void computeEmpWage(){
			
		
		   while (empDay < totalWorkingDays && totalEmpHrs< totalWorkingHrs) {
					
			  double randomValue=Math.floor(Math.random()*10)%3;
				switch ((int)randomValue) {
				
				case 1:
					empHrs=8;
					if(totalEmpHrs<=92) {
					totalEmpHrs=totalEmpHrs+empHrs;
					empDay++;
					}
					
					break;
				case 2:
					empHrs=4;
					if(totalEmpHrs<=96) {
					totalEmpHrs=totalEmpHrs+empHrs;
					empDay++;
					}
					break;
				default:
					empHrs=0;
				}
		   				
		   }
		    
				empWage=totalEmpHrs*wagePerHour;
				System.out.println("Total working hours :" +totalEmpHrs+"hrs");
				System.out.println("Total working days :" +empDay);
				System.out.println("Total wages of employee :"+ empWage);
		}
				
				public static void main(String[] args) {
					
					computeEmpWage();
		}	

}