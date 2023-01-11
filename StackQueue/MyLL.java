
public class MyLL {
	
	public StudentInfo frontOfList;
	public int numInList;
	
	
	public MyLL() {
		frontOfList = null;
		numInList = 0;
	}
	
	
	public void addToFront(StudentInfo studentToAdd) {
		
		if (studentToAdd == null) {
			return;  // Immediately return to the caller
		}
		
		if (numInList <= 0) {
			// Adding this student to an empty list!
			frontOfList = studentToAdd;
			numInList = 1;
			return;
		}
		
		// If I get to here, there is at least one student currently in the list.
		// So make studentToAdd the first in the list!
		
		studentToAdd.next = frontOfList;
		frontOfList = studentToAdd;
		numInList++;
		
	} // end addToFront
	
	
	public void displayList() {
		
		if (numInList <= 0) {
			System.out.println("\nThe list is empty!\n");
			return;
		}
		
		// If I get to here then there is at least one item in the list.
		// Walk through the list from front to rear and report each item.
		
		System.out.println("\nHere is the list from front to rear:");
		StudentInfo currentStudent = frontOfList;
		for (int i = 0; i < numInList; i++) {
			System.out.println("  " + currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		
	} // end displayList
	
	
	public StudentInfo removeFromFront() {
		
		if (numInList <= 0) {
			return null;
		}
		
		StudentInfo removedStudent = frontOfList;
		frontOfList = frontOfList.next;
		removedStudent.next = null;
		numInList--;
		
		return removedStudent;
		
	}


	public void addToRear(StudentInfo studentToAdd) {
		
		if (studentToAdd == null) {
			return;  
		}
		
		if (numInList <= 0) {
			// Adding this student to an empty list!
			frontOfList = studentToAdd;
			numInList = 1;
			return;
		}
		
		StudentInfo currentStudent = frontOfList;
		for (int i = 0; i < numInList-1; i++) {
			currentStudent = currentStudent.next;
		}
			
		currentStudent.next = studentToAdd;
		numInList++;

	}


	public StudentInfo removeFromRear() {
		
		StudentInfo currentStudent = frontOfList;
		
		if (numInList <= 0) {
			return null;
		}
		
		if (numInList == 1) {
			currentStudent = null;
			numInList--;
			return frontOfList;
		}
				
		for (int i = 0; i < numInList-2; i++) {
			currentStudent = currentStudent.next;
		}
			
		StudentInfo removedStudent = currentStudent.next;
		currentStudent.next = null;
		
		numInList--;
		return removedStudent;
		
	}
	

} // end MyLL
