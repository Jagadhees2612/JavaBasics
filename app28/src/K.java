abstract class A
{
	abstract  void test1();
}
class B extends A//whatever  abstr from a to b..u should be implememnt the b..
{
}
class K
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
o/p:
C:\javaC\jan30\app28\src>javac -d ../classes K.java
K.java:5: error: B is not abstract and does not override abstract method test1(
 in A
class B extends A
^
1 error
*/