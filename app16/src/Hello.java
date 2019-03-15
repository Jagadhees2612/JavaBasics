class I  //public class I means the max 1 public class will be allowed...
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! from I");
	}
}
class J
{
	public static void main(String[] args) //it is possible to devolop multiple main method classes..
	{
		System.out.println("Hello World! from  J");
	}
}

/*
o/p:

C:\javaC\jan30\app16\src>javac -d ../classes Hello.java

C:\javaC\jan30\app16\src>java -cp ../classes Hello
Error: Could not find or load main class Hello

C:\javaC\jan30\app16\src>java -cp ../classes I
Hello World! from I
*/