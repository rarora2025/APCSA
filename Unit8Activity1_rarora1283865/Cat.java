
/**
 * @author Rahul Arora
 *
 */
public class Cat {
	
	//defining attributes
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;
	
	
	
	public String eat()
	{
		return "Munch, Munch, Munch";
		
		
	}
	
	public String meow() {

		return "Meeeeeooww";
	
	}

	//get methods
	public String getBreed() {
		return breed;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public char getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}

	
	//set methods

	public void setBreed(String breed) {
		this.breed = breed;
	}

	
	public void setAge(int age) {
		this.age = age;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public void setSex(char sex) {
		this.sex = sex;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	
}
