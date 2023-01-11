import java.util.*;


public class MyHashTable {

	public ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		buckets = new ArrayList[howManyBuckets];

		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();
		}
	}


	// METHODS

	public int calcBucket(int empNumber) {
		return(Math.abs(empNumber) % buckets.length); 
	}


	public void addToTable(EmployeeInfo theEmployee) {
		if (theEmployee == null) {
			return;
		}
		
		int bucketNum = calcBucket(theEmployee.empNumber);
		buckets[bucketNum].add(theEmployee);
	}


	public EmployeeInfo removeFromTable(int empNum) {
		int bucketNum = calcBucket(empNum);

		if (buckets[bucketNum].isEmpty()) {
			return null;
			
		} else {
			for (int i = 0; i < buckets[bucketNum].size(); i++) {
				if (buckets[bucketNum].get(i).empNumber == empNum) {
					EmployeeInfo removedEmployee = buckets[bucketNum].get(i);
					buckets[bucketNum].remove(i);
					return removedEmployee;
					
				}
			}
		}
		
		return null;
	}

	
	public EmployeeInfo getFromTable(int empNum) {
		int bucketNum = calcBucket(empNum);

		if (buckets[bucketNum].isEmpty()) {
			return null;
			
		} else {
			for (int i = 0; i < buckets[bucketNum].size(); i++) {
				if (buckets[bucketNum].get(i).empNumber == empNum) {
					EmployeeInfo empToFind = buckets[bucketNum].get(i);
					return empToFind;
					
				}
			}
		}
		
		return null;
	}


	public void displayTable() {
		System.out.println("\n\nHERE ARE THE CONTENTS OF THE TABLE:");
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i].isEmpty()) {
				System.out.println("Bucket " + i + " is empty!");
			}
			else {
				System.out.println("Bucket " + i + " contains the following:");
				for (int j = 0; j < buckets[i].size(); j++) {
					System.out.println("    " + buckets[i].get(j).empNumber + " "
							+ buckets[i].get(j).firstName + " " + buckets[i].get(j).lastName
							+ " at position " + j);
				}
			}
		}	
	}
}
