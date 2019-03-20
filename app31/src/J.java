abstract class A
{
	abstract void test();//aact if (same signature attemot inthe overridding..abstr mtd over riding inthe mtd )
} 
class J extends A
{
	void test()
	{
		System.out.println("test()");
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.test();
		System.out.println("Hello World!");
	}
}

/*
O/P:
test()
Hello World!
*/