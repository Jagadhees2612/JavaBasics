class U
{
	static int i=test();

	public static int test() 
	{
		System.out.println("from test");
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:"+i);
	}
}

// all initializer execuite before main method execution.
/*
o/p:
from test
from main:100
*/