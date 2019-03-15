class D 
{
	private void test()
	{
	}
}
class E
{
	public static void main(String[] args) 
	{
		D d1 = new D();//private class cant be use in the another class..
		d1.test();
		System.out.println("done");
	}
}
/*
o/p:
C:\javaC\jan30\app25\src>javac -d ../classes E.java
E.java:12: error: test() has private access in D
                d1.test();
                  ^
1 error
*/
