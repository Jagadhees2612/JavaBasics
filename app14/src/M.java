class M
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
		   return "hello";
		}
		System.out.println("test end");
	}
}

/*
o/p:
M.java:16: error: incompatible types: unexpected return value
                   return "hello";
                          ^
1 error
*/