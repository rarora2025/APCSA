/*
 * @author Rahul Arora
 */

public class Person {
	
	
	protected String name;
	protected String address;
	protected String email_address;
	protected String phone_number;
	protected Date birthdate;
	

	
	
//constructor

	public Person(String name, String address, String email, String phone, Date date) {
		this.name = name;
		this.address = address;
		this.email_address = email;
		this.phone_number = phone;
		this.birthdate = date;
	}







	@Override
	public String toString() {
		return String.format("Class Name: %s%nPerson's name: %s%n", getClass().getName(), name);
		
	}

}
