class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,400);
		System.out.println("main end");
	}
	public static void test(int i)
	{
		System.out.println("test" +i);
	}
}

/*
o/p:
Z7.java:6: error: method test in class Z7 cannot be applied to given type
                test(100,400);
                ^
  required: int
  found: int,int
  reason: actual and formal argument lists differ in length
1 error
*/