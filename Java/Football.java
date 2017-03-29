import java.util.Scanner;
public class MenuChoice_7 
{
	public static void main(String[] args) 
	{
		Scanner input_choice = new Scanner( System.in);
		int choice; 								// user selection
		
		do{													
		  System.out.print("Please type in a year in the range 2000 to 2013 " +
												"and press return: ");
  		  choice = input_choice.nextInt();				// read user choice  
			
switch (choice)							// switch user choice 	
	  	{
	  	  case 2000:
	  	  case 2004:
	  	  case 2006:						// Kerry won in these years 	
	  	  case 2007:
	  	  case 2009:
	  		 System.out.println("Kerry won in " + choice);
		  break;
		 
	  	  case 2003:
	  	  case 2005: 						// Tyrone won in these years 	
	  	  case 2008:  	
	  		 System.out.println("Tyrone won in " + choice);
		  break;
		 
	  	  case 2001:
	  		 System.out.println("Galway won in " + choice); // Galway won in this 2001
		  break; 												
		 
	  	  case 2002:
	  		 System.out.println("Armagh won in " + choice);	// Armagh won in 2002
		  break; 												
	  	  case 2010:
	  		 System.out.println("Cork won in " + choice);	// Cork won in 2010 	
		  break;
		 
	  	  case 2011:
	  	  case 2013:
	  		System.out.println("Dublin won in " + choice); // Dublin won in 2011/13 
		  break;
		 
	  	  case 2012:
	  		System.out.println("Donegal won in " + choice); // Donegal won in 2012 	
		  break;
		 
	  	  default:
	  		System.out.println("Not a valid choice, try again."); // default  	
		  break;
		
	   	}// end switch
	  	 System.out.println();			// repeat until year in range 2000-2013 chosen
	  }while ((choice<=1999) || (choice>=2014)); 

   }// end main
}// end class 
