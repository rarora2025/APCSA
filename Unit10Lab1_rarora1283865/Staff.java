
public class Staff extends Employee {
	@Override
	public String toString() {
		return String.format("Class Name: %s%nPerson's name: %s%n", getClass().getName(), super.name);
		
	}
	
	//constructor
	public Staff(String n, String address, String email, String phone, Date d, double salary, Date date2, String jt) {
		//calling superclass constructor
		super(n, address, email, phone, d, salary, date2);
		this.job_title = jt;
		// TODO Auto-generated constructor stub
	}

	private String job_title;

	//set-get methods
	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

}
