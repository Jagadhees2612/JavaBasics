package pack1;
public class A
{
	int i;//i is defal test is also default..
	void test()
	{
	}
}
//default means no public,no protected , no private...default use for any another class will access..
/*
o/p:

C:\javaC\jan30\app26\src>javac -d ../classes pack1/A.java

C:\javaC\jan30\app26\src>java -cp ../classes pack1.A.java
Error: Could not find or load main class pack1.A.java

C:\javaC\jan30\app26\src>java -cp ../classes pack1/A.java
Error: Could not find or load main class pack1.A.java

C:\javaC\jan30\app26\src>java -cp ../classes pack1.A
Error: Main method not found in class pack1.A, please define the main method as:

   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/