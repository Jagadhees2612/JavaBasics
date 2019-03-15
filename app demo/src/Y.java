class Y 
{
	static int i = test();

	public static int test() 
	{
		System.out.println("from test");
		main(null);
		return 100;
	}
	public static void main(String[] args)
	{
		System.out.println("main:" +i);
	}
}
