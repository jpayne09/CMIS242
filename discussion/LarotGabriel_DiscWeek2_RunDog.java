/* Name: Larot, Gabriel
   Course: CMIS 242/6382
   Date: 05/24/2021 */

package discussion;

import java.util.Scanner;

public class LarotGabriel_DiscWeek2_RunDog {
	LarotGabriel_DiscWeek2_Dog d; //Attribute for dog class

	//Menu for user to select from
	public void displayMenu() { 
		System.out.println("\tMenu");
		System.out.println("1. Adopt a dog.");
		System.out.println("2. Change name.");
		System.out.println("3. Change age.");
		System.out.println("4. Tell dog to sit.");
		System.out.println("5. Change dog color.");
		System.out.println("5. Display pet information.");
		System.out.println("9. Exit.");
	}
	
	//Execute the command the user chooses
	public void processChoice(int x) { 
		switch (x) {
		case 1:		adopt();
					break;
		case 2:		changeName();
					break;
		case 3:		changeAge();
					break;
		case 4:		sit();
					break;
		case 5:		displayInfo();
					break;
		case 6:		setColor();
		case 9:		System.out.println("Thanks for using the program. Goodbye!");
					break;
		default:	System.out.println("Invalid selection.");
					System.out.println();
					break;
		}
	}
	//set dogs color
	private void setColor() {
		Scanner input = new Scanner(System.in);
		
		if(checkInstance()) {
			System.out.println("\nYou haven't adopted a dog yet.\n");
		} else {
			System.out.print("\nWhat do you want to change your pet's color to? ");
			String color = input.nextLine();
			
			d.setColor(color); //Call the setName method
			System.out.println("\nDog's color changed.\n");
		}
	}

	// User enters the pet's info and pet info is printed to screen
	public void adopt() { 
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nWhat breed of dog do you want? ");
		String breed = input.nextLine();
		System.out.print("What is your dog's name? ");
		String name = input.nextLine();
		System.out.print("What is your dogs color? ");
		String color = input.nextLine();
		System.out.print("How old is your dog? ");
		int age = input.nextInt();
		
		d = new LarotGabriel_DiscWeek2_Dog(breed, name, age,color); //Add the pet's info to the variable "d"
		
		System.out.println("\nDog adopted.\n");
	}
	
	//Change the name of the pet
	public void changeName() {
		Scanner input = new Scanner(System.in);
		
		if(checkInstance()) {
			System.out.println("\nYou haven't adopted a dog yet.\n");
		} else {
			System.out.print("\nWhat do you want to change your pet's name to? ");
			String name = input.nextLine();
			
			d.setName(name); //Call the setName method
			System.out.println("\nDog's name changed.\n");
		}
	}
	
	//Change the age of the dog
	public void changeAge() {
		Scanner input = new Scanner(System.in);
		
		if(checkInstance()) {
			System.out.println("\nYou haven't adopted a dog yet.\n");
		} else {
			System.out.print("\nWhat do you want to change your pet's age to? ");
			int age = input.nextInt();
			
			d.setAge(age); //Call the setName method
			System.out.println("\nDog's age changed.\n");
		}
	}
	
	//Tell dog to sit - checks if dog is already sitting, first
	public void sit() {
		if(checkInstance()) {
			System.out.println("\nYou haven't adopted a dog yet.\n");
		} else {
			if(d.getSit() == true) {
				System.out.println("\n" + d.getName() + " is already sitting.\n");
			} else {
				d.setSit(true);
				System.out.println("\n" + d.getName() + " sat down.\n");
			}
		}
	}
	
	//Verify if dog has been adopted yet
	public boolean checkInstance() {
		if(d == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//Print the pet's info to the screen
	public void displayInfo() {
		System.out.println("displaying info..\n" + d.toString()); //call toString in Dog class
	}

	public static void main(String[] args) {
		LarotGabriel_DiscWeek2_RunDog handler = new LarotGabriel_DiscWeek2_RunDog();
		Scanner input = new Scanner(System.in);
		int x;
		
		//Run until the user exits with "9"
		do {
			handler.displayMenu(); //Show menu
			System.out.print("  => ");
			x = input.nextInt();
			handler.processChoice(x); //Execute what the user selects
		} while(x != 9);
		
		input.close();
	}
}
