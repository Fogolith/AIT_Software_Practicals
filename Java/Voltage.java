import java.util.Scanner;
public class circuit1_a_2  
{
	// main method begins execution of Java application 
	public static void main(String[] args) 
	{
		double  R1  = 10;   	// Resistor1
		double  R2  = 15;		// Resistor2
		int R3;			// Resistor3
		double Rpar;   		// The parallel combination of Resistor2 and Resistor3
		double Vsupply = 12;	// The supply voltage
		double I1;   			// The current flowing through R1
		double I2;				// The current flowing through R2
		double I3;				// The current flowing through R3              
		double V1;   			// The voltage across R1
		double V2;				// The voltage across R2 (and R3)
		double P3;      		// The power in R3
		double PowerInR3 = 0;
		
		Scanner  myinput = new Scanner( System.in);
	    
	    System.out.println();
	   
	    for (R3 = 1; R3 < 10; R3++)                                                   
	    {	
	    Rpar = (R2 * R3)/(R2 + R3) ;	    // Calculate parallel equivalent of R1 and R2 
		I1 = Vsupply/(R1 + Rpar);				// Calculate I1
		V1 = I1 * R1;						// Calculate V1
		V2 = Vsupply - V1;					// Calculate V2
		I2 = V2/R2;							// Calculate I2               
		I3 = V2/R3;							// Calculate I3
		PowerInR3 = V2*I3;                  		// Calculate power in R3
		
		System.out.println("When R3 = " + R3 + " Ohms, Power in R3 = " + PowerInR3    
 + " Watts");		
	    }//end for
				
	}//end method main	                                                
}// end class circuit1
