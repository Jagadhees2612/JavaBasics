class A 
{
	public static void test() 
	{
		System.out.println("A.test");
	}
}
class N
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		//test();
		A.test();
		System.out.println("main end");
	}
}

/*
o/p:
main begin
A.test
main end
*/