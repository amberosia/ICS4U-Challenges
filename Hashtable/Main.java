
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FTE someFTE = new FTE(111111, "Daffy", "Duck", 1, 0.2, 100000.00);
		System.out.println(someFTE.firstName + " has net annual income of $" +
				someFTE.calcNetAnnualIncome());
		
		PTE somePTE = new PTE(222222, "Elmer", "Fudd", 0, 0.15, 20.0, 30.0, 40.0);
		System.out.println(somePTE.firstName + " has net annual income of $" +
				somePTE.calcNetAnnualIncome());
		
		MyHashTable theHT = new MyHashTable(10);
		theHT.addToTable(someFTE);
		theHT.displayTable();


	}

	
}
