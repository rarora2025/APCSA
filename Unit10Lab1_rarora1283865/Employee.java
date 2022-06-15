
public class Employee extends Person {
	
	//constructor
	public Employee(String n, String address, String email, String phone, Date d, double salary, Date date2) {
		//calling superclass constructor
		super(n, address, email, phone, d);
		this.salary = salary;
		this.hiredate = date2;
	}
	
	//new variables
	protected double salary;
	protected Date hiredate;
	
	@Override
	public String toString() {
		return String.format("Class Name: %s%nPerson's name: %s%n", getClass().getName(), super.name);
		
	}

}
