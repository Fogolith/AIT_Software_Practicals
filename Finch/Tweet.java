//Tweet.java 

Package Code; 
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class Tweet
{
	public static void main(final String[] args) 
	{
		//Instantiating the Finch objecct
		Finch myFinch = new Finch();

		int i = 0;

		// Finch Speaks 
		myFinch.saySomething("Hello, everybody I am a Finch and this is 
							what I sound like", 10000);
	
		// play sound clip 
		for (i = 0; i < 5; i++) 
		{
			myFinch.playClip("G:house_finch.au");
			myFinch.sleep(3500);
		}
	
		myFinch.quit();
		System.exit(0);
	}
}
