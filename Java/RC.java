public class RC_while_loop_no_input 
{
// main method begins execution of Java application 
 public static void main(String[] args) 
 {
		double R = 1000000;   		// Resistor
		double C = 0.0000022;		// Capacitor
		int    t = 0;   			// Loop variable for the time         	    2
		double Vs = 10;			// The supply voltage 
		double Vc;				// The voltage across the capacitor
		
while( t <= 5 )                                                             2                                      {
	 Vc = Vs*( 1 - Math.exp(-t/(R*C)));                                    	       
									      // Display Vc 
	 System.out.println("The voltage, Vc, across the capacitor at time  t = "   
	                           + t + " seconds equals " + Vc + " Volts"); 2	     
 System.out.println();
	    	 
        t++;                                                                      1
	}// end while
	
  }//end method main	
}// end class RC_for_loop                                           
