package bl.com.empwage;

public class EmpWage {

	public static void main(String[] args) {
		
		EmpWageBuilder obj1 = new EmpWageBuilder();
		System.out.println("Welcome to employee wage computation program");
		obj1.calculateMonthlyWage();

	}


}



class EmpWageBuilder{
	
	
	

	void calculateMonthlyWage() {

		int wagePerHour = 20;
		int workingHrs = 0;
		int totalWorkingHrs=0;
		int isFulltime = 1;
		int isParttime = 2;
		int isAbsent = 0;
		int dailyEmployeeWage = 0;
		int totalWage = 0;

		for (int i = 1; (totalWorkingHrs<=100)&&(i <= 20); i++) {

			int checkAttendance = (int) (Math.random() * 3);

			switch (checkAttendance) {

			case 1: {
				System.out.println("employee is present fulltime");
				workingHrs = 10;
				dailyEmployeeWage = wagePerHour * workingHrs;
				System.out.println("dailyemployeewage = " + dailyEmployeeWage);
			}
				break;

			case 2: {
				System.out.println("employee is present part time");
				workingHrs = 8;
				dailyEmployeeWage = wagePerHour * workingHrs;
				System.out.println("dailyemployeewage = " + dailyEmployeeWage);
			}
				break;

			case 0:

			{	
				workingHrs = 0;
				System.out.println("employee is absent");
				break;
			}
			}
			
			totalWorkingHrs=totalWorkingHrs+workingHrs;
			totalWage = totalWage + dailyEmployeeWage;
			
			if (totalWorkingHrs>100)
				
			{	System.out.println("greater than 100hrs hence ignoring last iteration");
				totalWorkingHrs=totalWorkingHrs-workingHrs;
				totalWage=totalWage-dailyEmployeeWage;}

		}

		System.out.println("total wage for the month :" + totalWage);
		System.out.println("totalWorkingHrs :" + totalWorkingHrs);

	}

	void calculateDailyWage() {

		int wagePerHour = 20;
		int workingHrs = 10;
		int isFulltime = 1;
		int isParttime = 2;
		int isAbsent = 0;

		int checkAttendance = (int) (Math.random() * 3);

		switch (checkAttendance) {

		case 1: {
			System.out.println("employee is present fulltime");
			int dailyEmployeeWage = wagePerHour * workingHrs;
			System.out.println("dailyemployeewage = " + dailyEmployeeWage);
		}
			break;

		case 2: {
			System.out.println("employee is present part time");
			int dailyEmployeeWage = wagePerHour * 8;
			System.out.println("dailyemployeewage = " + dailyEmployeeWage);
		}
			break;

		case 0:

		{
			System.out.println("employee is absent");
			break;
		}
		}
	}

}



	
	
	
	
	
	
	
	
	
	
	
	












