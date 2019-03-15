class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		test();
		System.out.println("main end");
	}
	public static int test() //any data type which is already available..if writen type other than mantatory
	{
		System.out.println("test begin");
		System.out.println("test middle");//ret is mantatory
		System.out.println("test end");
	}
}

/*
o/p:
P.java:15: error: missing return statement
        }
        ^
1 error
*/