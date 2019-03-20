interface A
{
	void test1();
	void test2();
	void test3();
}
abstract class B implements A
{
	public void test3()
	{
		System.out.println("B.test3()");
	}
}
class U extends B
{
	public void test1()
	{
		System.out.println("U.test1()");
	}
	public void test2()
	{
		System.out.println("U.test2()");
	}
	public static void main(String[] args)
	{
		System.out.println("done");
		U u1 = new U();
		u1.test1;
		u1.test2;

	}
}