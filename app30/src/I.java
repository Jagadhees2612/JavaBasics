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
class D
{
	void test4()
	{
		System.out.println("test4");
	}
}  
class I extends D implements A,B,C//1st put the extend and then implements
{
	public void test1()
	{
		System.out.println("test1");
	}
	
	public void test2()
	{
		System.out.println("test2");//i class only the concrete methd..
	}
	
	public void test3()
	{
		System.out.println("test3");//same class i can extend and and any no of interface 
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj = new I();
		obj.test1();
		System.out.println("------");
		obj.test2();
		System.out.println("------");
		obj.test3();
		System.out.println("------");
		obj.test4();
		System.out.println("main end");
	}
}

/*
o/p:
main begin
test1
------
test2
------
test3
------
test4
main end
*/
