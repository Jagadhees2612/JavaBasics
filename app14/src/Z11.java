class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,4.5);
		System.out.println("main end");
	}
	public static void test(int i,double i)
	{
		System.out.println("test" +i+ "," +i);
	}
}


/*
o/p:
Z11.java:9: error: variable i is already defined in method test
        public static void test(int i,double i)
                                             ^
1 error
*/