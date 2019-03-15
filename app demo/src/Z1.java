class Z1
{
	static int i = test();

	public static int test() 
	{
		System.out.println("from test");
		main(null);
		System.out.println("------");
		main(new String[]{});//physical  string object or empty object//
		System.out.println("------");
		main(new String[]{"hello", "xyz"});//physical  string object or empty object//
		return 100;
	}
	public static void main(String[] args)
	{
		i += 1;
		System.out.println("main:" +i+ "," +java.util.Arrays.toString(args));//runtime command like java -cp ../classes Z1 test 123//
	}
}

/*
o/p:
from test
main:1,null
------
main:2,[]
------
main:3,[hello, xyz]
main:101,[test, 123]
*/