class A
{
	int test()
	{
		System.out.println("subclass-test()");
		return 10;
	}
}
class M extends A
{
	int test()
	{
		System.out.println("subclass-test()");//a class testmtd got...
		{
		}
		return 10000;//while ovrriding demanding same return type..
	}

	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test();
		System.out.println("Hello World!");
	}
}

/*
O/P:
subclass-test()
Hello World!
*/