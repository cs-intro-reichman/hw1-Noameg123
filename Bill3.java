// Splits a restaurant bill evenly among three diners.

public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int sum = Integer.parseInt(args[3]); //המרה בסטרינג לאינט
		double average = sum / 3;
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 + ": pay " + average + " " + "Shekels each." );
	    // Replace this comment with the rest of your code  
		//% java Bill3 Ron Lisa Dan 100 Dear Dan, Lisa, and Ron: pay 34.0 Shekels each. 
	}
}
