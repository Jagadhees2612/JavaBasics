class B 
{
	private int i;//private member usage in access only inside class...it can be allowed to use within the class..
}
class c
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
	}
}

/*
o/p:
C:\javaC\jan30\app25\src>javac -d ../classes B.java
javac: file not found: B.java
Usage: javac <options> <source files>
use -help for a list of possible options
*/
