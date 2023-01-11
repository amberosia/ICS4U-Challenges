
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyBinaryTree theTree = new MyBinaryTree(); // Instantiate an EMPTY tree
		StudentInfo someStudent;
		
		someStudent = new StudentInfo(2, "Daffy", "Duck");
		theTree.insert(theTree.root, someStudent);
		
		someStudent = new StudentInfo(11, "Elmer", "Fudd");
		theTree.insert(theTree.root, someStudent);
		
		someStudent = new StudentInfo(5, "Lola", "Bunny");
		theTree.insert(theTree.root, someStudent);
		
		someStudent = new StudentInfo(7, "Arya", "Vishnu");
		theTree.insert(theTree.root, someStudent);
		
		someStudent = new StudentInfo(18, "A", "B");
		theTree.insert(theTree.root, someStudent);
		
		someStudent = new StudentInfo(3, "B", "C");
		theTree.insert(theTree.root, someStudent);
		
		someStudent = null;
		theTree.insert(theTree.root, someStudent);

		System.out.println("Inorder traversal!");
		theTree.inorder(theTree.root);
		
		System.out.println("\nPreorder traversal!");
		theTree.preorder(theTree.root);
		
		System.out.println("\nPostorder traversal!");
		theTree.postorder(theTree.root);

	}

}
