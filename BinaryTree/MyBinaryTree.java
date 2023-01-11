
public class MyBinaryTree {

	public StudentInfo root;
	public int numInTree;

	public MyBinaryTree() {
		root = null;
		numInTree = 0;
	}
	
	public void insert(StudentInfo targetNode, StudentInfo itemToAdd) {
		if (itemToAdd == null) {
			return;
		}

		if (numInTree == 0) {
			root = itemToAdd;
			numInTree = 1;
			
		} else if (itemToAdd.studentNumber < targetNode.studentNumber) {
			if (targetNode.left == null) {
				targetNode.left = itemToAdd;
				numInTree++;

			} else {
			insert(targetNode.left, itemToAdd);
			}
			
		} else {
			if (targetNode.right == null) {
				targetNode.right = itemToAdd;
				numInTree++;

			} else {
			insert(targetNode.right, itemToAdd);
			}
		}
	}
	
	public void inorder(StudentInfo targetNode) {
		if (numInTree == 0) {
			System.out.println("The tree is empty!");
			return;
		}
		
		if (targetNode.left != null) {
			inorder(targetNode.left);
		}
		
		if (targetNode != null) {
		System.out.print(targetNode.studentNumber + " ");
		
		}
		
		if (targetNode.right != null) {
			inorder(targetNode.right);
		}
	}
	
	public void preorder(StudentInfo targetNode) {
		if (numInTree == 0) {
			System.out.println("The tree is empty!");
			return;
		}
		
		if (targetNode != null) {
			System.out.print(targetNode.studentNumber + " ");
		}
		
		if (targetNode.left != null) {
			preorder(targetNode.left);
		}
		
		if (targetNode.right != null) {
			preorder(targetNode.right);
		}
	}
	
	public void postorder(StudentInfo targetNode) {
		if (numInTree == 0) {
			System.out.println("The tree is empty!");
			return;
		}
		
		if (targetNode.left != null) {
			postorder(targetNode.left);
		}
		
		if (targetNode.right != null) {
			postorder(targetNode.right);
		}
		
		if (targetNode != null) {
		System.out.print(targetNode.studentNumber + " ");
		}
	}
	
}
