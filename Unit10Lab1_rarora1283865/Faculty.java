
public class Faculty extends Employee {
	@Override
	public String toString() {
		return String.format("Class Name: %s%nPerson's name: %s%n", getClass().getName(), super.name);
		
	}
	
	//constructor
	public Faculty(String n, String address, String email, String phone, Date d, double salary, Date date2, String oh, String r) {
		//calling superclass cpnstructor
		super(n, address, email, phone, d, salary, date2);
		this.office_hours = oh;
		this.rank = r;
	}
	
	//new variables
	private String office_hours;
	private String rank;
	
	//set-get methods
	public String getOffice_hours() {
		return office_hours;
	}
	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

}
