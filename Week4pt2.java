/**
 * 
 * @author jamescontreras
 *
 **/
import java.util.Scanner;

public class Week4pt2 {
public static void main(String[] args) {
	String answer;
	int creditScore , age;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Hello I'm a car dealer,\nwould you like to buy a car?");
	answer = input.next();
	if(answer.equalsIgnoreCase ("Yes")) {
		System.out.println("Ok, let me show you the cars available...");
		System.out.println("Wait, how old are you?");
		age = input.nextInt();
		if(age>=25) {
			System.out.println("Ok, good");
			System.out.print("What model would you like?");
			String answer1 = input.next();
			checkModel(answer1);
		}else {
			System.out.println("Sorry, i can't sell you the vehicle");
		}
	}else {
		System.out.println("Ok, come back when you'd like to purchase a vehicle.");
	}
}
public static void checkModel(String model) {
	switch(model) {
	case"Ferrari_488GTB":
		System.out.println("$262,647.00");
		break;
	case "2018 Ferrari_California":
		System.out.println("$202,723.00");
		break;
	case "Lambo_Urus":
		System.out.println("That's $200,000.00");
		break;
		default:
			System.out.println("Please come back later, they're currently out of stock.");
	}
}
}
