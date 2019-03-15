class Z4
{
	static
	{
		System.out.println("SIB1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static
	{
		System.out.println("SIB2");
	}
	static
	{
		System.out.println("SIB3");
	}
}

// first initializer-top to bottom
/*
SIB1
SIB2
SIB3
main
*/