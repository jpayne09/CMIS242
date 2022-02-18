/* Name: Larot, Gabriel
   Course: CMIS 242/6382
   Date: 05/24/2021 */

package discussion;

public class LarotGabriel_DiscWeek2_Dog {
	//Dog class attributes - set to private, and use get/set methods to access the variables
	private String breed;
	private String name;
	private int age;
	private boolean sit;
	private String color;
	
	//Constructor for the dog class
	public LarotGabriel_DiscWeek2_Dog(String breed, String name, int age, String color) {
		this.breed = breed;
		this.name = name;
		this.age = age;
		this.color = color;
		sit = false;
	}
	
	//Sets the dog's name
	public void setName(String name) {
		this.name = name;
	}
	
	//Sets the dog's age
	public void setAge(int age) {
		this.age = age;
	}
	
	//Sets sit
	public void setSit(boolean sit) {
		this.sit = sit;
	}
	
	//Gets the dog's name
	public String getName() {
		return name;
	}
	
	//Get whether dog is sitting
	public boolean getSit() {
		return sit;
	}

	public void setColor(String color){
		this.color = color;
	}
	
	//Display pet info
	@Override
	public String toString() {
		return "\nPet info [Breed=" + breed + ", Name=" + name + ", Age=" + age + ", Color="+ color +"]\n";
	}
	
}
