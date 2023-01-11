
public class PTE extends EmployeeInfo {
	
	
	public double hourlyWage;
	public double hoursPerWeek;
	public double weeksPerYear;
	
	
	public PTE(int empNumber, String firstName, String lastName, int workLoc, double deductRate, double hourlyWage, double hoursPerWeek, double weeksPerYear) {
		super(empNumber, firstName, lastName, workLoc, deductRate);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
		this.weeksPerYear = weeksPerYear;
	}
	
	
	public double calcNetAnnualIncome() {
		return ((1.0 - deductRate) * hourlyWage * hoursPerWeek * weeksPerYear);
	}


}
