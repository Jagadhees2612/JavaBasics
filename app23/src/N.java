class A 
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		this();
		System.out.println("A(int)");
	}

	A(int i, int j)
	{
		this(i);
		System.out.println("A(int, int)");
	}
	{
		System.out.println("A-IIB");
	}
}
class N
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A(20);
		System.out.println("---------");
		A a3 = new A(20,30);
		System.out.println("---------");
	}
}

/*
o/p:
A-IIB
A()
---------
A-IIB
A()
A(int)
---------
A-IIB
A()
A(int)
A(int, int)
---------
*/