interface A
{
	void test1();
	void test2();
}
class T implements A
{
	public void test1()
	{
		System.out.println("T.test1()");
	}
	public void test2()
	{
		System.out.println("T.test2()");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
		T t1  = new T();
		t1.test1();
		t1.test2();

	}
}
