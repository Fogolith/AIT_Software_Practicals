import java.util.Scanner;
public class WHILE_Random_Nos_Short_1_2
{
	public static void main(String[] args) 
	{		
	   int  SECRET_NUMBER;							// the secret number 1-100
	   int guess = -1;							// the user guess    
	   int number_of_guesses = 0;						// the number of guesses   
	   										// taken by the user to
	   										// get the right answer
Scanner myinput= new Scanner( System.in);

	   SECRET_NUMBER =  (int)Math.ceil(Math.random()*100); 	// the secret number 1-100 	

	   while ( guess != SECRET_NUMBER)	 			// keep looping until the user   
	   {	   								// guesses the right number	
		  
  System.out.print("Enter your guess between 1 and 100 and press return: ");//prompt     
		  guess  =  myinput.nextInt();     			// read the guess from the user. 
		  
		  number_of_guesses++;					// add 1 to number of guesses    
		  
		  if (guess > SECRET_NUMBER ) 			// if guess too high	         
		   {
			 System.out.println("Too High");		// print too high
		   }
		  else if (guess < SECRET_NUMBER ) 			// else if guess too low         	
		   {	
			 System.out.println("Too Low");		// print too low
		   }
				
		  	  System.out.println();				// blank line for readability
					
		}// end while    
											
										// print out results
	   	System.out.println("Congratulations " + guess + " was the correct answer" );    
		System.out.println("You got it in " + number_of_guesses+ " guesses");           
	   		
	}// end main
}//end class  					
