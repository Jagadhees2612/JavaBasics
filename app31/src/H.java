abstract class A
{
	abstract void testt();
}  
class H extends A
{
	void test(int i)//inherited mtd not //concrete inherit mtd which is incorporsted..
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
O/P:
C:\javaC\jan30\app31\src>javac -d ../classes H.java
H.java:5: error: H is not abstract and does not override abstract method testt()
 in A
class H extends A
^
1 error
*/
