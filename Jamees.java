/**;
 * 
 *  @author James
 *
 **/
import java.util.Random;
public class Jamees {
	public static void main(String[] args) {
		Random randgen;
		int  num;
		int num2;
		
		randgen= new Random();
		num  = randgen.nextInt(15) + 1; //generates a random value from 1-15
		num2 = 14;
		
		System.out.println("The number of today is...");
		System.out.println(num);
		
		if (num==num2)
			System.out.println("it's a match");
		else
			System.out.println("it is not a match");
		
	}

}
