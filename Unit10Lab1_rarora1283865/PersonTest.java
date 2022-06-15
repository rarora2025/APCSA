
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of new people, some more specific than others
		Person[] people = {
			new Person("Kerstin Pierrette", "714 Appletree Ct", "k.pierrette@att.net", "(302) 798-1353", new Date(4,21,1975)), 
			new Student("Donovan Francis", "4304 Divoky Rd", "donovan.francis125@gmail.com", "(870) 879-5041", new Date(1,25,2004), "Junior"),
			new Employee("Willis Frank", "191 Boulder View Dr.", "wfrank1967@mac.com", "(401) 737-5890", new Date(2,15,1967), 75000.24, new Date(5,5,2014)), 
			new Faculty("Katrina Wilkes", "1319 E 17th St", "katrina@sbcglobal.net", "(765) 884-8281", new Date(10,23,1955), 80000.44, new Date(11,4,2012), "9-3", "instructor"),
			new Staff("Joshua Turner", "16149 Paradise Ln", "turner.joshua@yahoo.com", "(563) 557-8268", new Date(10,23,1960), 70000.55, new Date(10,28,2004), " Communication Specialist")
			
		};
		//looping through the people and calling their shared overriden method
		for(Person person:people) {
			System.out.println(person.toString());
			
		}
		
	}

}
