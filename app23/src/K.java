class A 
{
	A()
	{
		System.out.println("A()");
	}
}
class K extends A
{
	K()
	{
		System.out.println("K()");
		this(10);
	}
	K(int i)
	{
		System.out.println("K()");
	}
	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println("Hello World!");
	}
}
/*
o/p:
K.java:13: error: call to this must be first statement in constructor
                this(10);
                    ^
1 error
*/
