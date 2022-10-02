package bl.com.empwage;

public class CompanyEmpWage {

	public String company;
	public int empRatePerHour;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

	}

	public void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

	@Override
	public String toString() {
		return "CompanyEmpWage [totalEmpWage=" + totalEmpWage + "]";
	}

}
