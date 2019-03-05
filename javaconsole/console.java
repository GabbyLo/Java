import java.util.Scanner;

class mainconsole{

	public static void main(String[] args) {
		grade12class obj = new grade12class();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a String value: ");
		// String thevalue = sc.nextLine();
		// obj.getvalue(thevalue);
		System.out.print("Enter Username: ");
		String xusername=sc.nextLine();
		System.out.print("Enter Password: ");
		String xpassword=sc.nextLine();


	}
}

class grade12class
{
	private String username ="codeus";
	private String password ="1234";
	public void checkaccount(String iusername, String ipassword)
	{
		if (username.equals(iusername) && password.equals(ipassword)) {
			
		}
	}
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
	public void getvalue(String x)
	{
		System.out.println("The value is "+x);
	}
	public void displaymessage()
	{
		System.out.println("Hello this is a message from grade 12 class");
	}
}