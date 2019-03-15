class Z13
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		test(i);//passbyvalue
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
main end:10
*/