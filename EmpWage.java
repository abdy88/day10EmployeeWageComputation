package bl.com.empwage;

public class EmpWage {

	public static void main(String[] args) {

		System.out.println("Welcome to employee wage computation program");

		int checkAttendance = (int) (Math.random() * 2);

		if (checkAttendance == 0) {
			System.out.println("employee is present");
		}
		else{
			System.out.println("employee is absent");}
		
	}

}
