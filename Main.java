package bl.com.empwage;

public class Main {
	
	
	public static void main(String[] args) {
		
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("tata",30,5,10);
		empWageBuilder.addCompanyEmpWage("mahindra",50,7,20);
		empWageBuilder.computeEmpWage();
		
		
	}

}
