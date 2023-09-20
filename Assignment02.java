package hw2;

/* ICS 111 Assignment 02
 * Aaron Lander Ancheta, Section 002
 * September 13, 2022
 */

public class Assignment02 {

	public static void main(String[] args) {
		
		String data = "A string is an object in Java.";
		String obs = "Observed: ";
		String mat = "Match: ";
		
		
		int dataSize = data.length();
        String obj = data.substring(15,21);
        String jav = data.substring(25,29);
        String capsJav = jav.toUpperCase();
        
        
        
        
        System.out.println("Data: "+ data);
        
        System.out.println("");
        System.out.println("Length");
        System.out.println(obs + dataSize);
        System.out.println("Expected: 30");
        System.out.println(mat+ (dataSize == 30));
        
        System.out.println("");
        System.out.println("Substring");
        System.out.println(obs + obj);
        System.out.println("Expected: object");
        System.out.println(mat+ obj.equals("object"));
        
        System.out.println("");
        System.out.println("ALL caps");
        System.out.println(obs + capsJav);
        System.out.println("Expected: JAVA");
        System.out.println(mat+ capsJav.equals("JAVA"));
	}

}
