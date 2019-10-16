import java.util.Scanner;

public class SMSAbbreviations1 {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the SMS abbreviation: ");
		String abbrv = scan.nextLine();
		String translation = "";
		
		if(abbrv.equalsIgnoreCase("LOL")) {
			translation = "Laughing Out Loud";
		}
		
		else if(abbrv.equalsIgnoreCase("TMI")) {
			translation = "Too Much Information";
		}
		
		else if(abbrv.equalsIgnoreCase("SMH")) {
			translation = "Shaking My Head";
		}
		
		else if(abbrv.equalsIgnoreCase("OFC")) {
			translation = "Of Course";
		}
		
		else {translation = "Unknown Abbreviation";}
		
		System.out.println("You entered: " + translation);
	}
}