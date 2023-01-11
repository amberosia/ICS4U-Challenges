
public class StudentInfo {
	
	public int studentNumber;
	public String firstName;
	public String lastName;
	public StudentInfo next;
	
	
	public StudentInfo(int studentNumber, String firstName, String lastName) {
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		next = null;
	}

}
