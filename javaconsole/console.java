import java.util.Scanner;

class mainconsole{

	public static void main(String[] args) {
		grade12class obj = new grade12class();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value: ");
		String thevalue = sc.nextLine();
		obj.getvalue(thevalue);

	}
}

class grade12class
{
	
	public void getvalue(String x)
	{
		System.out.println("The value is "+x);
	}
	public void displaymessage()
	{
		System.out.println("Hello this is a message from grade 12 class");
	}
}