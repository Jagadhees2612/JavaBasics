class G
{
	static int i;
}
class H
{
	public static void main(String[] args) //max 1 public class is allowed..
	{
		System.out.println("Hello World!");
	}
}


/*
o/p:
C:\javaC\jan30\app16\src>java -cp ../classes G
Error: Main method not found in class G, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

*/