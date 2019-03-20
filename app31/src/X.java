interface A
{
	void test();//u trying to implement inthe inter fave mtd is public..while ovrriding interface mthd u should ovrrid a public..
}
class X extends A
{
    void test()
	{
		System.out.println("subclass-test");
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
O/P:

C:\javaC\jan30\app31\src>javac -d ../classes X.java
X.java:5: error: no interface expected here
class X extends A
                ^
1 error
*/