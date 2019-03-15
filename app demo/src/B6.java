class B6 
{
	public static void test()
	{
		System.out.println("test begin");
		if(true)
		{
			System.out.println("from if");
			return;
		}
		System.out.println("test end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}

/*
o/p:
main begin
test begin
from if
main end
*/
