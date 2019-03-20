interface A
{
	void test1();
}
class S implements A
{
	public void test1()
	{
		System.out.println("S.test1()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
