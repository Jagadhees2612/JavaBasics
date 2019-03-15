class Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		test(i);
		System.out.println("main middle:" +i);
		test(100);
		System.out.println("main end:" +i);
	}
	public static void test(int i)
	{
		System.out.println("test:" +i);
		i = 20;
	}
}

/*
o/p:
main begin
test:10
main middle:10
test:100
main end:10
*/