class A 
{
	A()
	{
		System.out.println("A()");//if (the 1st staten is super it will be cllg iib stae)
	}

	A(int i)
	{
		//this();
		System.out.println("A(int)");
	}
	{
		System.out.println("A-IIB");
	}
}
class M
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A(20);
		System.out.println("--------");
	}
}
/*
o/p:
A-IIB
A()
--------
A-IIB
A()
A(int)
--------
*/
