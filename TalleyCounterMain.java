
public class TalleyCounterMain {

	public static void main(String[] args) 
	{
	
		Talley counter1 = new Talley();
		Talley counter2 = new Talley(100);
		
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println(counter1.getCount());
		counter1.reset();
		System.out.println(counter1.getCount());
		System.out.println(counter2);
		String str = counter2.toString();
		String string = "" + counter1;;
		System.out.println(str);
		System.out.println(string);
	}

}
