class B
{
	static
	{
		System.out.println(i);//direct read ,using a value of i
		i = 10;//direct write,assigning value of i
		test();
	}

    static int i; //before notifying global variable by jvm..compiler is not allowed usage of direct read

	public static void test() //no global var cannot read directly before reading jvm..why because it is line 6 is write..so any kind of write is allowed..
	{
		System.out.println(i); //indirect read
		i = 20; //indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}

/*
o/p:
B.java:5: error: illegal forward reference
                System.out.println(i);//direct read ,using a value of i
                                   ^
1 error
*/