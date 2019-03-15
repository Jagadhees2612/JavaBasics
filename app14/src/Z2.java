class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		String s1=test();
		System.out.println("main end" +s1);
	}
	public static String test() //1.all classes( including built in classes)2.all interfaces(including built in interfaces)3.all enums(including built in enum)
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
		return "jaga";
	}
}

/*
o/p:
main begin
main middle
test begin
test middle
test end
main endjaga
*/