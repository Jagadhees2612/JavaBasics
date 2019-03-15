class Z
{
	static int i = test();

	public static int test() 
	{
		System.out.println("from test");
		main(null);
		System.out.println("------");
		main(new String[]{});//physical  string object or empty object//
		return 100;
	}
	public static void main(String[] args)
	{
		System.out.println("main:" +i+ ":" +args);
	}
}

/*
o/p:
from test
main:0:null
------
main:0:[Ljava.lang.String;@15db9742
main:100:[Ljava.lang.String;@6d06d69c
*/