class D 
{
	public static void main(String[] args) //method defenition
	{
		System.out.println("main begin");
		test();//method calling statement
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("test()");
	}
}

/*
o/p:
main begin
test()
main end
*/