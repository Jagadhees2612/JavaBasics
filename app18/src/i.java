class I
{
	void test1()
	{
		System.out.println("test1");
	}
	void test2()
	{
		System.out.println("test2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");//to access non ststic mem we have to use ref var
		I king = new I();
		king.test1();
		I jaga = new I();
		System.out.println("----");
		king.test2();
		System.out.println("main end");
	}
}

/*
o/p:
main begin
test1
----
test2
main end
*/