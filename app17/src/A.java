class A 
{
	static
	{
		System.out.println("from main.A");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main.A");
	}
}

class B 
{
	static
	{
		System.out.println("from main.B");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main.B");
	}
}

/*
o/p:
from main.A
from main.A
*/