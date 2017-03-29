import java.util.Scanner;
public class turkey_weights_array_1	
{
	public static void main(String[] args) 
	{	
		final int MAX_SIZE = 6;        			// number of turkeys 
		double [] turkey_weight = new double[MAX_SIZE];	// array for turkey weights											// loop index
		int i;							// loop variable
		double sum = 0;						// summation variable
		double price_per_kg = 5.05;				// price per kg of turkey
		double heaviest_turkey_weight = 0.0;		// storage for heaviest weight
		Scanner myinput = new Scanner(System.in);		// for user input
		
		for ( i  = 0; i < MAX_SIZE; i++)			// input turkey weights
		{		
		  System.out.print("Please enter the weight of turkey " + i + " and press 
     return: ");
		  turkey_weight[i] = myinput.nextDouble();
		}                                                             	
	
		System.out.println();
		for ( i  = 0; i < MAX_SIZE; i++)				// print out turkey weights
		{		
		   System.out.println("Turkey " + i  + " weighs " + turkey_weight[i] + "kg  and
  costs " + turkey_weight[i]*5.05 + " euro");
		}
												  	
		
		for ( i  = 0; i < MAX_SIZE; i++)			 // calculate total turkey weights
		{		
			sum = sum + turkey_weight[i]; 				  	
		}
		
		System.out.println();
		System.out.println("The average turkey weighs " + sum/MAX_SIZE + "kg");
     											
		sum = 0;
		for ( i  = 0; i < MAX_SIZE; i++)			  // calculate total turkey cost
		{		
			sum = sum + turkey_weight[i]*price_per_kg;              	
		}
		
		System.out.println();						  // print out results	
		System.out.println("The total cost of all the turkeys is " + sum+ "euro");
												   	
		System.out.println();
		heaviest_turkey_weight = turkey_weight[0];
		for ( i  = 0; i < MAX_SIZE; i++)			 // calculate total turkey weights
		{		
			if (turkey_weight[i] > heaviest_turkey_weight)
				 heaviest_turkey_weight = turkey_weight[i];   		
		}
		for ( i  = 0; i < MAX_SIZE; i++)			 // calculate total turkey weights
		{		
			if (turkey_weight[i] == heaviest_turkey_weight)
			 System.out.println("Turkey " + i + " is the heaviest and weighs " + 
                              heaviest_turkey_weight + "kg"); 			
		}	
	}//end of main										
}// end of class	ArrayDemo8_Q57
