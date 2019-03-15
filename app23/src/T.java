class A 
{
	static int i;
	static
	{
		System.out.println("A-SIB1");
	}
	static
		{
		System.out.println("A-SIB2");
		}
}
class  B extends A
{
	static int j;
	static
	{
		System.out.println("B-SIB1"); 
	}

	static
	{
		System.out.println("B-SIB2"); 
	}
}

class  T 
{
	static
	{
		System.out.println("T-SIB1"); 
	}
	static
	{
		System.out.println("T-SIB2"); 
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("-----------");
		System.out.println(B.j);
		System.out.println("main end");
	}
}

/*
o/p:
T-SIB1
T-SIB2
main begin
A-SIB1
A-SIB2
0
-----------
B-SIB1
B-SIB2
0
main end
*/