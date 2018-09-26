/**
 * 
 * @author kdepaula20
 *
 */
public class Talley 
{
	//Instance Variables
	
	private int count;
	//private int startValue;
	
	//Constructor
	
	public Talley()
	{
		count = 0;
	}
	
	public Talley(int startNum)
	{
		count = startNum;
		//this means you can start the Talley counter at any number you want
	}
	
	public void click()
	{
		count = count + 1;
		//count++; (this is a shortcut for count = count +1;
		//count+=1; (this is a shortcut to add any number)
		//you can also do multiply, divide, or subtract instead of +
	}
	
	public void unclick()
	{
		count = count - 1;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "count:" + count;
	}
}

