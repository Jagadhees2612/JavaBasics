class R
{
	static int i;

	public static void test() 
	{
		System.out.println("test:"+i);
		i=20;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
		i=10;
		test();
        System.out.println("main:"+i);
	}
}

/*
o/p:
main:0
test:10
main:20
*/
