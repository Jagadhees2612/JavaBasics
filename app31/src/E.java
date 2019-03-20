class E
{
	private int test()
	{
		System.out.println("test()");
		return 100;
	}
	final protected static void test(int i)
	{
		System.out.println("test(int)");
	}
	final  public void test(double i)///3 mtd s having a diff signature change in any arguenment data type
	{
		System.out.println("test(double)");
	}
	public static void main(String[] args)
	{
		E obj = new E();
		obj.test();
		System.out.println("-------");
		E.test(20);
		System.out.println("-------");
		E.test(2.0);
		System.out.println("-------");
	}
}