class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		String s1=test();
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
		return 100;
	}
}

/*
o/p:
U.java:7: error: incompatible types: int cannot be converted to String
                String s1=test();
                              ^
1 error
*/