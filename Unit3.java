/**
 * @author jamescontreras
 **/
 import java.io.StringWriter;
 import java.io.PrintWriter;
 
public class Unit3 {
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
	PrintWriter pw = new PrintWriter(sw);
	pw.print("Celine Dion");
	//sending the characters to the buffer
	String name = sw.toString();
	//turn sequence of characters into a String
	System.out.println(name);
	
	//%(flag)(width).(precision)specifier
	System.out.printf("Her name was %5s", name);
	
	
	}

}
