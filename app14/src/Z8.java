class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100,400);
		System.out.println("main end");
	}
	public static void test(int i,int j)
	{
		System.out.println("test" +i);
	}
}

/*
o/p:
main begin
test100
main end
*/