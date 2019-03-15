class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test");
	}
}


/*
Z3.java:6: error: method test in class Z3 cannot be applied t
                test();
                ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/