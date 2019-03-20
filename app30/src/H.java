interface A
{
	void test1();
}
interface B
{
	void test2();//test methjods
}
interface C
{
	void test3();
}
class H implements A,B,C 
{
	public void test1()
	{
		System.out.println("H-test1");
	}
	public void test2()
	{
		System.out.println("H-test2");
	}
	public void test3()
	{
		System.out.println("H-test3");
	}


	public static void main(String[] args) //no dont req abstract class..
	{
		H obj = new H();
		obj.test1();
		System.out.println("-------");
		obj.test2();
		System.out.println("-------");
		obj.test3();
		System.out.println("main end");
	}
}


/*
o/p:
H-test1
-------
H-test2
-------
H-test3
main end
*/