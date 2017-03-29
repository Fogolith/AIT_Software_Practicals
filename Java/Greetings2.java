import java.util.Scanner; // program uses class Scanner

public class Greetings_2_1 
{

	// main method begins execution of Java application
	public static void main(String[] args) {

		
		String   userName;		// storage for user's name
		String   place;			// storage for where user lives
				
		int      reindeer ;		// storage for user's number of reindeer
		double   userDistance;		// storage for user's distance to work		
		
		// create a scanner called myinput to obtain input values 
		// from the keyboard.
		Scanner  myinput = new Scanner( System.in);
	             
	    	System.out.print("Enter your name and press return:  ");     //prompt		
		userName  =  myinput.nextLine();     // read user's name from the keyboard.		
//prompt 		1
		System.out.print("Enter the name of the place where you live and press return: ");     
place  =  myinput.nextLine();     // read user's town from the keyboard.		

		System.out.print("Enter your number of reindeer and press return:  ");    //prompt
		reindeer  =  myinput.nextInt();   // input user's number of reindeer 		

		
System.out.print("Enter how many miles you travel in a working day and  	
press return:  "); //prompt
		userDistance  =  myinput.nextDouble();     // read user's age from the keyboard.
		
		// print a blank line for ease of viewing
		System.out.println();
		
		// print out information
		System.out.println("Hello " +  userName );						 
		System.out.println("You live at " +  place );
System.out.println("You have " +   reindeer + " reindeer, and travel " 
+ userDistance + " miles in your working day");
		System.out.println();
		
	} // end method main
	
} // end class Greetings_2_1	
