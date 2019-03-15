class Z5
{
	static int i = test();

	static
	{
		System.out.println("SIB1");//static intialization block..it is also intializer..
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
	}

	static
	{
		System.out.println("SIB2");//static intialization block..it is also intializer..
	}

	static int test()
	{
		System.out.println("from test");
		return 100;//static intialization block..it is also intializer..
	}

    static
	{
		System.out.println("SIB3");//static intialization block..it is also intializer..
	}

}

/*
o/p:
from test
SIB1
SIB2
SIB3
main
*/