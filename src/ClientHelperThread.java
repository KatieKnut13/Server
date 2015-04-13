
public class ClientHelperThread extends Thread
{
	protected int[] theFileArray;
	
	ClientHelperThread(int[] theFileArray)
	{
		this.theFileArray = theFileArray;
	}
}
