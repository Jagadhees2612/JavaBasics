class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");
		if(true)
		{
		   return;
		}
		System.out.println("test end");
	}
}

/*
o/p:
main begin
main middle
test begin
test middle
main end
*/