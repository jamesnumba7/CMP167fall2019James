/**
 * @author jamescontreras
 **/

import java.util.Scanner;
public class Week3p2 {
	public static void main(String[] args) {
		String mywords= "Hello Sara 23";
		Scanner inStream= new Scanner(mywords);
		
		String greeting = inStream.next();
		String name =inStream.next();
		int age= inStream.nextInt();
		
		System.out.printf("%s, The age of %s is %d", greeting, name, age);
		
		}
}
