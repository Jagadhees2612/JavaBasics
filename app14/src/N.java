class N
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
		   System.out.println("if end");
		}
		System.out.println("test end");
	}
}

/*
o/p:
N.java:17: error: unreachable statement
                   System.out.println("if end");
                   ^
1 error
*/
