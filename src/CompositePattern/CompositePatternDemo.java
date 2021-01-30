package CompositePattern;

public class CompositePatternDemo {
	public static void main(String args[]) {
		Employee e1 = new Cashier(101, "Sohan Kumar", 2000.0);
		Employee e2 = new Cashier(102, "Mohan Kumar", 2500.0);
		Employee e3 = new Accountant(103, "Seema Mahiwal", 3000.0);
		Employee manager = new BankManager(100, "Ashwani Rajput", 10000.0);
		
		manager.addEmployee(e1);
		manager.addEmployee(e2);
		manager.addEmployee(e3);
		
		manager.print();
	}

}
