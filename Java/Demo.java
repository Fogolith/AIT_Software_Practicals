import java.util.Scanner; 					// program uses class Scanner

public class Q16f_If_Demo
{
	// main method begins execution of Java application

	public static void main(String[] args)
	{

	 // create a Scanner to obtain input from the keyboard
	 Scanner myinput = new Scanner( System.in);
		
	 double l,w,h,c; 			 				// storage for length, width, 
 	// height and cost of shed  2		
		
			
	 System.out.print("Type in the shed length, l, in metres and press return:  ");//prompt
	 l = myinput.nextDouble();				// input length from keyboard     
		
	 System.out.print("Type in the shed height, h, in metres and press return:  ");//prompt
	 height = myinput.nextDouble();			// input height from keyboard     
		
	 System.out.print("Type in the shed width, w, in metres and press return:   ");//prompt
	 width = myinput.nextDouble();			// input width from keyboard      
		
									// calculate cost of shed  
   c = ( l*w  +  2*l*h  + 2*h*w  +  0.14*w*w  +  1.15*l*w)*20; 	    		    
		
									// print out cost of shed  
 System.out.println("The cost of the materials for the shed is " 
+ (int)c + " euros"); 					    	    


	 } // end method main
} // end class Q16f_If_Demo
