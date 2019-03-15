class E 
{
	static int i =10;

	static
	{
		System.out.println("from E.SIB");
	}
}

class F
{
	static
	{
		System.out.println("from F.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(E.i);
		E.i =20;
		System.out.println(E.i);
		E.i =30;
		System.out.println(E.i);
		System.out.println("main end");
	}
}

/*
o/p:
from F.SIB
main begin
from E.SIB
10
20
30
main end
*/
