package CompositePattern;

public class Cashier implements Employee {
	private int id;
	private String name;
	private double salary;
	
	public Cashier(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public Employee getChild(int i) {
		return null;
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public double getSalary() {
		return salary;
	}
	
	@Override
	public void print() {
		System.out.println("ID:" + getId());
		System.out.println("Name:" + getName());
		System.out.println("Salary:" + getSalary());
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
}
