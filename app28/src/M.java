abstract class A
{
	abstract void test1();
}
abstract class B extends A
{
}
class M
{
	public static void main(String[] args) 
	{
		B obj = new B();
		System.out.println("done");
	}
}

/*
o/p:
C:\javaC\jan30\app28\src>javac -d ../classes M.java
M.java:12: error: B is abstract; cannot be instantiated
                B obj = new B();
                        ^
1 error
*/
