package bl.com.empwage;

public class EmpWage {

	public static void main(String[] args) {
		EmpWage obj1 = new EmpWage();
		System.out.println("Welcome to employee wage computation program");
		obj1.calculateDailyWage();

	}

	void calculateDailyWage() {

		int wagePerHour = 20;
		int workingHrs = 8;
		int isPresent = 1;
		int isAbsent = 0;

		int checkAttendance = (int) (Math.random() * 2);

		if (checkAttendance == 1) {
			System.out.println("employee is present");
			int dailyEmployeeWage = wagePerHour * workingHrs;
			System.out.println("dailyemployeewage = " + dailyEmployeeWage);
		} else {
			System.out.println("employee is absent");

			int dailyEmployeeWage = 0;
			System.out.println("dailyemployeewage = " + dailyEmployeeWage);
		}

	}

}
