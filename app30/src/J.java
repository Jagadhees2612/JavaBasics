interface A
{
	void test1();
}
interface B extends A//interface to inter to extends another interface..both methd are inheriting to j..
{
	void test2();//test methjods
}
interface C
{
	void test3();
}
class D 
{
	void test4()
	{
		System.out.println("test4");
	}
}
class J extends D implements B,C
{
	public void test1()
	{
		System.out.println("test1");
	}
	public void test2()
	{
		System.out.println("test2");
	}
	public void test3()
	{
		System.out.println("test3");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");//j class cant have no abstract so call test method by using obj referenxcce..
		J obj = new J();
		obj.test1();
		System.out.println("---------");
		obj.test2();
		System.out.println("---------");
		obj.test3();
		System.out.println("---------");
		obj.test4();
		System.out.println("main end");
	}
}

/*
O/P:
main begin
test1
---------
test2
---------
test3
---------
test4
main end
*/
