package CompositePattern;

public interface Employee {
	public int getId();
	public String getName();
	public double getSalary();
	public void print();
	public void addEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee getChild(int i);
}
