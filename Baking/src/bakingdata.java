import java.util.Scanner;

//INTIALIZATION
public class bakingdata {
	int eggsAmount;
	int eggsMin = 1;
	int milkAmount;
	int milkMin = 200; //milliliter
	int flourAmount;
	int flourMin = 100; //grams
	
	//INTRODUCTION	
	public static String intro(String[] args) {
		Scanner name = new Scanner(System.in); 
		System.out.println("Please input your name...");
		String chefName = name.nextLine(); 
		System.out.println("Hello Chef " + chefName + "!");
		System.out.println("Factory is starting up...");
		return chefName;
	}
	
	//INGREDIENTS
	public int chefInput () {
	System.out.println("\nHow many eggs do you have?");
	Scanner chefInput;
	chefInput = new Scanner(System.in);
	eggsAmount = chefInput.nextInt();
	System.out.println("You have " + eggsAmount + " eggs...");
	//EGGS

	System.out.println("\nHow much milk do you have?");
	chefInput = new Scanner(System.in);
	milkAmount = chefInput.nextInt();
	System.out.println("You have " + milkAmount + "ml of milk...");
	//MILK
	
	System.out.println("\nHow much flour do you have?");
	chefInput = new Scanner(System.in);
	flourAmount = chefInput.nextInt();
	System.out.println("You have " + flourAmount + "g of flour...");
	//FLOUR
	return eggsAmount;
	}	
	
	//MAIN CODE
	public void main (String[] args) {
		System.out.println("");
		if (eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
			System.out.println("Insufficient materials...");
		} else {
			eggsAmount = eggsAmount / eggsMin;
			System.out.println("you have " + eggsAmount + " portions of eggs...");
			
			milkAmount = milkAmount / milkMin;
			System.out.println("you have " + milkAmount + " portions of milk...");
			
			flourAmount = flourAmount / flourMin;
			System.out.println("you have " + flourAmount + " portions of flour...");
		}
	}
	public int status () {
		//INVENTORY CHECK
		int smallest;
		if (eggsAmount <= milkAmount && milkAmount <= flourAmount) {
				smallest = eggsAmount;
		} else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
				smallest = milkAmount;
		} else {
				smallest = flourAmount;
		}
		
		//STATUS
		System.out.println("");
		System.out.println("You can make " + smallest*4 + " pieces of cookies...");
		System.out.println("");
		System.out.println("You will need " + smallest*eggsMin + " eggs...");
		System.out.println("You will need " + smallest*milkMin + " ml of milk...");
		System.out.println("You will need " + smallest*flourMin + " grams of flour...");
		System.out.println("");
		System.out.println("Factory is shutting down...");
		return smallest;
	}
}
