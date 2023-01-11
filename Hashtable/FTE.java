
public class FTE extends EmployeeInfo {
	
	
	public double salary;
	
	
	public FTE(int empNumber, String firstName, String lastName, int workLoc, double deductRate, double salary) {
		super(empNumber, firstName, lastName, workLoc, deductRate);
		this.salary = salary;
	}
	
	
	public double calcNetAnnualIncome() {
		return ((1.0 - deductRate) * salary);
	}

}
