class T 
{
	static int i;//t1,t2 is written data are derived data type
	public static void  test1(T t1)
	{
		System.out.println("test1:" +t1.i);
		t1.i +=200;
	}
	public static T  test2() 
	{
		T ref = new T(); //create a obj at anywhere once obj is create gotover 
		System.out.println("test2 begin:" + ref.i);
		ref.i =200;
		test1(ref);
		System.out.println("test2 end:" + ref.i);
		ref.i += 300;
		return ref;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
        T ref = test2();
		System.out.println("main end:" + ref.i);
	}
}

/*
o/p:
main begin
test2 begin:0
test1:200
test2 end:400
main end:700
*/