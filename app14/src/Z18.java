class Z18
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		int j = test(--i);
		System.out.println("main end:" +i+"," +j);
	}
	public static int test(int i) 
	{
		System.out.println("test:" +i);
		return --i;
	}
}

/*
o/p:
main begin
test:9
main end:9,8
*/