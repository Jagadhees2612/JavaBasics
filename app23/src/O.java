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
class  B extends A  
{
	B()
	{
		super(90);
		System.out.println("B()");
	}
	B(int i)
	{
		this(i, i);
		System.out.println("B(int)");
	}
	B(int i,int j)
	{
		super(i, j);
		System.out.println("B(int,int)");
	}
	{
		System.out.println("B-IIB");
	}
}
class O
{
	public static void main(String[] args)
		{
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A(20);
		System.out.println("---------");
		A a3 = new A(20,30);
		System.out.println("---------");
		B b1 = new B();
		System.out.println("---------");
		B b2 = new B(20);
		System.out.println("---------");
		B b3 = new B(20,30);
		System.out.println("---------");//sub class cons giving call to cons...
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
A-IIB
A()
A(int)
B-IIB
B()
---------
A-IIB
A()
A(int)
A(int, int)
B-IIB
B(int,int)
B(int)
---------
A-IIB
A()
A(int)
A(int, int)
B-IIB
B(int,int)
---------
*/