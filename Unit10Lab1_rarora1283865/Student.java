
public class Student extends Person {
	
	public Student(String n, String address, String email, String phone, Date d, String cs) {
		//calling superclass constructor
		super(n, address, email, phone, d);
		this.class_status = cs;
	}

	//attributes 
	
	private String class_status;
	
	//set-get methods

	public String getClass_status() {
		return class_status;
	}

	public void setClass_status(String class_status) {
		this.class_status = class_status;
	}

	@Override
	public String toString() {
		return String.format("Class Name: %s%nPerson's name: %s%n", getClass().getName(), super.name);
		
	}
}
