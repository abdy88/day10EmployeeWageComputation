package bl.com.empwage;

public class EmpWage {

	public static void main(String[] args) {
		
		System.out.println("Welcome to employee wage computation program");
		
		
		EmpWageBuilderObject pantaloons = new EmpWageBuilderObject(100, 300, 20, "Pantaloons");
		pantaloons.calculateMonthlyWage();
		System.out.println('\n');
		EmpWageBuilderObject tata = new EmpWageBuilderObject(120, 400, 30, "tata");
		tata.calculateMonthlyWage();

	}

}

class EmpWageBuilderObject {

	int wagePerHour;
	int totalWorkingHrs;
	int totalWorkingDays;
	String companyName;

	EmpWageBuilderObject(int wagePerHour, int totalWorkingHrs, int totalWorkingDays, String companyName) {

		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.totalWorkingHrs = totalWorkingHrs;
		this.totalWorkingDays = totalWorkingDays;

	}

	void calculateMonthlyWage() {

//		int wagePerHour = 20;
		int workingHrs = 0;
		int totalHrs = 0;
		int isFulltime = 1;
		int isParttime = 2;
		int isAbsent = 0;
		int dailyEmployeeWage = 0;
		int totalWage = 0;
//		int totalWorkingDays=0;

		for (int i = 1; (totalHrs <= totalWorkingHrs) && (i <= totalWorkingDays); i++) {

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

			totalHrs = totalHrs + workingHrs;
			totalWage = totalWage + dailyEmployeeWage;

			if (totalHrs > totalWorkingHrs)

			{
				System.out.println("greater than totalworkinghrs hence ignoring last iteration");
				totalHrs = totalHrs - workingHrs;
				totalWage = totalWage - dailyEmployeeWage;
			}

		}

		System.out.println("total wage for the month :" + totalWage + "for the company " + companyName);
		System.out.println("totalWorkingHrs :" + totalHrs);

	}

}
