class H
{
	int i;
	void test()
	{
		System.out.println("THest");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H obj = new H();
		System.out.println(obj.i);
		obj.test();
        H h1 = new H();
		System.out.println("----");
		obj.i += 20;
		H jeg = new H ();
		System.out.println(h1.i);
		jeg.test();
		System.out.println("main end");
	}
}

/*
o/p:
main begin
0
THest
----
0
THest
main end
*/
