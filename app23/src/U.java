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

class  U 
{
	static
	{
		System.out.println("U-SIB1"); 
	}
	static
	{
		System.out.println("U-SIB2"); 
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("-----------");
		System.out.println(B.j);
		System.out.println("-----------");
		System.out.println(A.i);
		System.out.println("main end");
	}
}

/*
o/p:
U-SIB1
U-SIB2
main begin
-----------
A-SIB1
A-SIB2
B-SIB1
B-SIB2
0
-----------
0
main end
*/