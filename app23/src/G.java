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
}
class B extends A
{
	B()
	{
		super(9);
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		super(i);
		System.out.println("C(int)");
	}
	C(int i,int j)
	{
		this(i);
		System.out.println("C(int,int)");
	}
}
class G
{

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("--------");//for 1 obj creation aplicabke cons
		C c2 = new C(10);
		System.out.println("--------");
		C c3 = new C(3,7);
		System.out.println("--------");
		System.out.println("main end");
	}
}

/*
o/p:
main begin
A()
A(int)
B()
C()
--------
A()
B(int)
C(int)
--------
A()
B(int)
C(int)
C(int,int)
--------
main end
*/