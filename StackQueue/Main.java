
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		MyStack theStack = new MyStack();
		
		someStudent = new StudentInfo(111111, "Daffy", "Duck");
		theStack.push(someStudent);
		theStack.peek();
		
		someStudent = new StudentInfo(222222, "Elmer", "Fudd");
		theStack.push(someStudent);
		theStack.peek();
		
		someStudent = new StudentInfo(111111, "Lola", "Bunny");
		theStack.push(someStudent);
		theStack.peek();
		
		theStack.pop();
		
		theStack.displayStack();
		
		MyQueue theQueue = new MyQueue();
		
		someStudent = new StudentInfo(111111, "Daffy", "Duck");
		theQueue.enqueue(someStudent);
		theQueue.displayQueue();
		
		theQueue.dequeue();
		theQueue.displayQueue();
		
		someStudent = new StudentInfo(222222, "Elmer", "Fudd");
		theQueue.enqueue(someStudent);
		theQueue.displayQueue();
		
		someStudent = new StudentInfo(111111, "Lola", "Bunny");
		theQueue.enqueue(someStudent);
		theQueue.displayQueue();
		
		theQueue.dequeue();
		theQueue.displayQueue();
		

	}

}
