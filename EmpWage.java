package bl.com.empwage;

public class EmpWage {

	public static void main(String[] args) {
		EmpWage obj1 = new EmpWage();
		System.out.println("Welcome to employee wage computation program");
		obj1.calculateDailyWage();

	}

	void calculateDailyWage() {

		int wagePerHour = 20;
		int workingHrs = 10;
		int isFulltime = 1;
		int isParttime = 2;
		int isAbsent = 0;

		int checkAttendance = (int) (Math.random() * 3);

		if (checkAttendance == 1) {
			System.out.println("employee is present fulltime");
			int dailyEmployeeWage = wagePerHour * workingHrs;
			System.out.println("dailyemployeewage = " + dailyEmployeeWage);
		} else if (checkAttendance == 2) {
			System.out.println("employee is present part time");
			int dailyEmployeeWage = wagePerHour * 8;
			System.out.println("dailyemployeewage = " + dailyEmployeeWage);
		} else {
			System.out.println("employee is absent");
		}

	}

}
