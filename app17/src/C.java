class C
{
	static
	{
		System.out.println("from SIB.C");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main.C");
	}
}

class D
{
	static
	{
		System.out.println("from SIB.D");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main.D begin");
		C.main(null);
		System.out.println("-----");
		C.main(args);
		System.out.println("from main.D end");
	}
}

/*
o/p:
from SIB.C
from main.C
*/