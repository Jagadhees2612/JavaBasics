class  R
{
	int i;

	public static void test()
	{
		R ref = new R();
		System.out.println(ref.i);
		ref.i =200;
		System.out.println(ref.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		R.test();
	    System.out.println("main begin");
	}
}
/*
o/p:
main begin
0
200
main begin
*/