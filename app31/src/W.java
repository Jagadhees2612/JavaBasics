class A 
{
	public void test()
	{
		System.out.println("superclass-test");
	}
}
class W extends A
{
	protected void test()
	{
		System.out.println("subclass-test");
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//private < default < protected < public

/*
O/P:
C:\javaC\jan30\app31\src>javac -d ../classes W.java
W.java:10: error: test() in W cannot override test() in A
        protected void test()
                       ^
  attempting to assign weaker access privileges; was public
1 error
*/
