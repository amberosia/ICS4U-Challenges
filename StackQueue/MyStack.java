
public class MyStack {

	public StudentInfo top;
	public int numInStack;
	
	
	public MyStack() {
		top = null;
		numInStack = 0;
	}
	
	
	public void push(StudentInfo studentToAdd) {
		
		if (studentToAdd == null) {
			return; 
		}
		
		if (numInStack <= 0) {
			top = studentToAdd;
			numInStack = 1;
			return;
		}

		studentToAdd.next = top;
		top = studentToAdd;
		numInStack++;
		
	} 
	
	
	
	public StudentInfo pop() {
		
		if (numInStack <= 0) {
			return null;
		}
		
		StudentInfo removedStudent = top;
		top = top.next;
		removedStudent.next = null;
		numInStack--;
		
		return removedStudent;
		
	}

	public void peek() {
		
		if (numInStack <= 0) {
			System.out.println("The stack is empty!");
			return;
		}
		
		System.out.println("Top of stack: " + top.firstName);
		
	}
	
	public void displayStack() {
		
		if (numInStack <= 0) {
			System.out.println("The stack is empty!");
			return;
		}
		
		System.out.println("Here is the stack from top to bottom:");
		StudentInfo currentStudent = top;
		for (int i = 0; i < numInStack; i++) {
			System.out.println("  " + currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		
	}
	
}

	