class  A
{
	void test()
	{
		System.out.println("test()");
	}
}
class G extends A//a test mthd over inheri mtd also involved in the overload..btween this diff signature..
{
	void test(int i)
	{
		System.out.println("test(int)");
	}
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.test(90);
		System.out.println("--------");
		g1.test();
		System.out.println("--------");
	}
}

/*
O/P:
test(int)
--------
test()
--------
*/