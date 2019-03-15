class Y
{
	static int i=test();

	public static int test() 
	{
		System.out.println("from test");
		main(null);
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:"+i);
	}
}

/*
from test
from main:0
from main:100
*/