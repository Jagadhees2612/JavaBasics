abstract class A
{
	abstract void test1();
}
abstract class B extends A//nothod matter abs avail in abst me..
{
	void test1()
	{
		System.out.println("test1");
	}
}
class N
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		System.out.println("done");
	}
}
/*
o/p:
C:\javaC\jan30\app28\src>javac -d ../classes N.java
N.java:16: error: B is abstract; cannot be instantiated
                B obj = new B();
                        ^
1 error
*/