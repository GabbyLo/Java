import java.util.Scanner;
class gab{
	public static void main (String[] args)
	{
		MyClass objmyclass = new MyClass();
		Scanner sc= new Scanner(System.in);
		System.out.println("Input a value: ");
		String avalue=sc.nextLine();
		objmyclass.thevalue(avalue);
	}
}

class MyClass
{
	public void thevalue(String y)
	{
		System.out.println("The value you inputted is "+y);
	}
}