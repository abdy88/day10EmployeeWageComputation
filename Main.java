package bl.com.empwage;

//UC12

public class Main {
	
	
	public static void main(String[] args) {
		
		IComputeEmpWage empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("tata",30,5,10);
		empWageBuilder.addCompanyEmpWage("mahindra",50,7,20);
		empWageBuilder.computeEmpWage();
		
		System.out.println("Total wage for tata" + empWageBuilder.getTotalWage("tata"));
		
	}

}
