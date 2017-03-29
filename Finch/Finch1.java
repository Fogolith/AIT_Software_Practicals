// Finch_1/Code/RemoteControl_1.java
package Code;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

import java.util.Scanner;

import javax.swing.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Remote_Control_1 extends Frame implements ActionListener 
{
	public Remote_Control_1()
{
	display = new TextField("            FINCH COMMANDS");
	display.setEditable(false); 
	add(display, "North");
	Panel p = new Panel();
	p.setLayout(new GridLayout(4,2));

	addButton(p, "Forward" );
	addButton(p, "Back" );
	addButton(p, "Left" );
	addButton(p, "Right" );
	addButton(p, "Halt" );
	addButton(p, "Green Nose" );
	addButton(p, "Yellow Nose" );
	addButton(p, "Exit" );
	add(p, "Center");
	
      }
	
	private void addButton(Container c, String s)
	{
		Button b = new Button(s);
		c.add(b);
		b.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent evt)
	{
		
		String s = evt.getActionCommand();
		
			if (start)	
			{
				if (s.equals("Exit")!= true)
				{
				 display.setText(s);
				 start = true;
				 int choice = s.charAt(0);
				 
				 switch (choice)
				  {
				  	 case 'F':
				  		 myFinch.setWheelVelocities(100,100); //turn motors cw   					
					 break;
					 
				  	 case 'B':
				  		myFinch.setWheelVelocities(-100,-100);//turn motors ccw 	
					 break;
					 
				  	 case 'L':
				  		myFinch.setWheelVelocities(100,0);// turn motors left 
					 break;
					 
				  	 case 'R':
				  		myFinch.setWheelVelocities(0,100);//turn motors right 
					 break;	
					 
				  	 case 'H':
				  		myFinch.setWheelVelocities(0,0); //turn motors off 
					 break;
					 
				  	 case 'G':
				  		myFinch.setLED(Color.green);//turn nose green
					 break;
					 
				  	case 'Y':
				  		myFinch.setLED(Color.yellow);//turn nose yellow
					 break;
					 
				  	case 'E':
				  		System.exit(0);
					 break;
					 
				  	default:
				  		System.out.println("Not a valid choice \n");
					break;
				  }// end switch	 
			}// end if
				
			else
			{
				// Halt Finch here 
				{display.setText(s);start = false;System.exit(0);}
			}// end else
		
		}//  end method actionPerformed
				 
	  }
	   
	   
	//@SuppressWarnings("deprecation")
	public static void main(String[] args)
	   {
		
		   Frame f = new Remote_Control_1();
		   f.show(); 
		   
		}// end main
	   
	   private TextField display;
	 
	   private boolean start = true;
	   
	   Finch myFinch = new Finch();
}
