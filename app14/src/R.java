class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		System.out.println("main end");
	}
	public static int test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
		return "hello";
	}
}

/*
o/p:
R.java:15: error: incompatible types: String cannot be converted to int
                return "hello";
                       ^
1 error
*/
