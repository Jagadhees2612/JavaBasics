class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		boolean s1=test();
		System.out.println("main end" +s1);
	}
	public static boolean test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
		return true;
	}
}

/*
o/p:
main begin
main middle
test begin
test middle
test end
main endtrue
*/