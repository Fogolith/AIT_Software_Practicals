package Code;  
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.awt.Color;
public class ExamQu1415
  {
   public static void main(final String[] args)
   {	
	   	Finch myFinch = new Finch();	// Create a new Finch object 		
   
    		// Do nothing until an obstacle detected
    	   	while(myFinch.isObstacle()== false)									{
    	     		myFinch.setLED(Color.red);  	// turn LED red 			
    	    		myFinch.sleep(500);	    	// for 0.5 secs
    	     		myFinch.setLED(Color.black);	// turn LED off(black) 		
    	     		myFinch.sleep(500); 		// for 0.5 secs
    	   	}
    		myFinch.setLED(Color.blue);		// turn LED blue

    	    	// while there is an obstacle in front of the Finch 
    	   	// go straight for it at full speed in 0.1 sec steps
    	     while(myFinch.isObstacle()== true)						
    	     {
    	    	 myFinch.setWheelVelocities(255,255); 					
    	    	 myFinch.sleep(100);
    	     }
    	     
    	     // Obstacle gone ==> turn LED green, stop, pause for 1 second
    	     myFinch.setLED(Color.green);							
    	     myFinch.setWheelVelocities(0,0);
    	     myFinch.sleep(1000);
    	      
    	     // compare left and right light sensors
    	     if (myFinch.getLeftLightSensor()== myFinch.getRightLightSensor())	
    	     {								// if equal			
    	    	 myFinch.setWheelVelocities(128,128); 					
    	    	 myFinch.sleep(5000);
    	     }								// if left > right
    	     else if (myFinch.getLeftLightSensor()> myFinch.getRightLightSensor())
    	     	      {
 	    	 		myFinch.setWheelVelocities(64,128); 			
 	    	 		myFinch.sleep(5000);
    	     	      } 							// if left < right
    	     else   {
	    	 		myFinch.setWheelVelocities(128,64); 			
	    	 		myFinch.sleep(5000);
 	     		}
    	     
    	     myFinch.stopWheels();         		// stop Finch for 4 secs	
    	     myFinch.sleep(4000);
    	     		
    	     myFinch.setWheelVelocities(128,-128); 	//rotate 180 degs		
    	     myFinch.sleep(5000);
    	     		
     myFinch.saySomething("The temperature is " + myFinch.getTemperature()+ " 
degrees Celsius");
    	     myFinch.sleep(3000);	//read and speak temperature 			
           myFinch.quit();
           System.exit(0); 	
    } //end main  } // end ExamQu1415
