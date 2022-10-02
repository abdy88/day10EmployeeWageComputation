package bl.com.empwage;

public class EmpWage {

	public static void main(String[] args) {
		EmpWage obj1 = new EmpWage();
		System.out.println("Welcome to employee wage computation program");
		obj1.calculateMonthlyWage();

	}

	void calculateMonthlyWage() {

		int wagePerHour = 20;
		int workingHrs = 10;
		int isFulltime = 1;
		int isParttime = 2;
		int isAbsent = 0;
		int dailyEmployeeWage = 0;
		int totalWage = 0;

		for (int i = 1; i <= 20; i++) {

			int checkAttendance = (int) (Math.random() * 3);

			switch (checkAttendance) {

			case 1: {
				System.out.println("employee is present fulltime");
				dailyEmployeeWage = wagePerHour * workingHrs;
				System.out.println("dailyemployeewage = " + dailyEmployeeWage);
			}
				break;

			case 2: {
				System.out.println("employee is present part time");
				dailyEmployeeWage = wagePerHour * 8;
				System.out.println("dailyemployeewage = " + dailyEmployeeWage);
			}
				break;

			case 0:

			{
				System.out.println("employee is absent");
				break;
			}
			}

			totalWage = totalWage + dailyEmployeeWage;

		}

		System.out.println("total wage for the month :" + totalWage);

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
