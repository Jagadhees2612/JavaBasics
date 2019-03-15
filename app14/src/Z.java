class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		char s1=test();
		System.out.println("main end" +s1);
	}
	public static char test() 
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
		return 'j';
	}
}

/*
o/p:
main begin
main middle
test begin
test middle
test end
main endj
*/
