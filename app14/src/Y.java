class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		double s1=test();
		System.out.println("main end" +s1);
	}
	public static double test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
		return 2.6;
	}
}

/*
o/p:
main begin
main middle
test begin
test middle
test end
main end2.6
*/