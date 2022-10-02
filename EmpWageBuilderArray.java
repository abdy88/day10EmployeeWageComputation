package bl.com.empwage;

public class EmpWageBuilderArray {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public int numOfCompany = 0;
	public CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() {

		companyEmpWageArray = new CompanyEmpWage[5];

	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);

	}

	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}

	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {

			totalWorkingDays++;
			int empCheck = (int) Math.random() * 3;

			switch (empCheck) {

			case IS_PART_TIME:
				empHrs = 4;
				break;

			case IS_FULL_TIME:
				empHrs = 8;
				break;

			default:
				empHrs = 0;

			}

			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Days" + totalWorkingDays + "empHrs" + empHrs);

		}

		return totalEmpHrs * companyEmpWage.empRatePerHour;

	}

}
