class A
{
	int test()
	{
		System.out.println("subclass-test()");
		return 10;
	}
}
class N extends A
{
	boolean test(int i)
	{
		System.out.println("subclass-test(int)");//while ovrrid ret type same..
		{
		}
		return true;
	}
	public static void main(String[] args)
	{
		N obj = new N();
		obj.test();
		System.out.println("done");
	}
}

/*
O/P:
subclass-test()
done
*/
