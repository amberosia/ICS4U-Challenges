
public class EmployeeInfo {
	
	
	public int empNumber;
	public String firstName;
	public String lastName;
	public int workLoc; // encoded work location
	public double deductRate;  // overall deduction rate for income
	
	
	public EmployeeInfo(int empNumber, String firstName, String lastName, int workLoc, double deductRate) {
		this.empNumber = empNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workLoc = workLoc;
		this.deductRate = deductRate;
	}
	
	
	public double calcNetAnnualIncome() {
		return (0.0);
	}


}