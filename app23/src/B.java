class A 
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");//compiler will incorp spr withno n arg...
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main brgin");
		B b1 = new B();
		System.out.println("----------");
		B b2 = new B(20);
		System.out.println("-----------");
		System.out.println("main end");
	}
}

/*
o/p:
main brgin
A()
B()
----------
A()
B(int)
-----------
main end
*/