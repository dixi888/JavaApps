import java.util.*;

public class HelloWorld{

	public static void main(String [] args)
	{
	System.out.println("WElcome");
	System.out.println(new Date() + "CI started...");
	try{
		Thread.sleep(1000);
	} catch (Exeption e){

	System.out.println(e);
	}
	System.out.println("WElcome");
	System.out.println(new Date() + "CI started...");
	}
}