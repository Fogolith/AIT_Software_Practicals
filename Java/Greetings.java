import java.util.Scanner;                                         // Project: Greetings

public class Greetings_2 
{

	// main method begins execution of Java application
	public static void main(String[] args) {

		
		String   userName;					// storage for user's name  
		String   townName;					// storage for user's town 	
		int      children;		// storage for user's number of children
		double   userDistance;		// storage for user's distance to work 		
		
		// create a scanner called myinput to obtain input values 
		// from the keyboard.
		Scanner  myinput = new Scanner( System.in);
	             
		
System.out.print("Enter your name and press return:  ");     //prompt  		

	    	userName  =  myinput.nextLine();  // read user's name from keyboard. 		
		

	   	System.out.print("Enter the name of your town and press return:  ");   //prompt  														
	      townName  =  myinput.nextLine();  // read user's town from keyboard.	         	
	      
      System.out.print("Enter your no. of children and press return:  ");    //prompt 														
children  =  myinput.nextInt();    // read user's number of 								     //children from the keyboard.
													     //prompt
	      System.out.print("Enter your distance to work in miles and press return:  "); 

		userDistance  =  myinput.nextDouble(); //read user's age from keyboard.       
		
		 
		System.out.println();					// print a blank line
		
		System.out.println("Hello " +  userName ); 	// print out information 	
		System.out.println("You live in  " +  townName ); 					
		System.out.println("You have " +   children + " children, and live "       								+ userDistance + " miles from work");   		2
		System.out.println("Have a nice day");

	} // end method main
	
} // end class Greetings_1
