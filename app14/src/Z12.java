class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
	public static void test(int i)
	{
		double i = 5.4;
		System.out.println("test" +i+ "," +i);
	}
}

/*
o/p:
Z12.java:10: error: variable i is already defined in method test(int,double)
                double i = 5.4;
                       ^
					   1errors
					   */
