
public class MyQueue {

	public StudentInfo frontOfQueue;
	public int numInQueue;
	
	
	public MyQueue() {
		frontOfQueue = null;
		numInQueue = 0;
	}
	
	
	public void enqueue(StudentInfo studentToAdd) {
		
		if (studentToAdd == null) {
			return;  
		}
		
		if (numInQueue <= 0) {
			frontOfQueue = studentToAdd;
			numInQueue = 1;
			return;
		}
		
		StudentInfo currentStudent = frontOfQueue;
		for (int i = 0; i < numInQueue-1; i++) {
			currentStudent = currentStudent.next;
		}
			
		currentStudent.next = studentToAdd;
		numInQueue++;

	}
	
	
	public StudentInfo dequeue() {
		
		if (numInQueue <= 0) {
			return null;
		}
		
		StudentInfo removedStudent = frontOfQueue;
		frontOfQueue = frontOfQueue.next;
		removedStudent.next = null;
		numInQueue--;
		
		return removedStudent;
		
	}
	
	public void displayQueue() {
		
		if (numInQueue <= 0) {
			System.out.println("The queue is empty!");
			return;
		}

		System.out.println("Here is the queue from front to rear:");
		StudentInfo currentStudent = frontOfQueue;
		for (int i = 0; i < numInQueue; i++) {
			System.out.println("  " + currentStudent.firstName);
			currentStudent = currentStudent.next;
		}
		
	}
	
}
