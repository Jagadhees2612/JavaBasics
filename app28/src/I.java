abstract class A 
{

}
class I
{
	public static void main(String[] args) 
	{
		A obj = new A();
		System.out.println("done");//insisde... a abstra class  is def or implement..abstract class means incomplete class..
	}
}

/*
o/p:
C:\javaC\jan30\app28\src>javac -d ../classes I.java
I.java:9: error: A is abstract; cannot be instantiated
                A obj = new A();
                        ^
1 error
*/