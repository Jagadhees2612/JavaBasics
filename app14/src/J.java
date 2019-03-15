class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		return;
		System.out.println("main end");
	}
}
		
/*
o/p:
J.java:8: error: unreachable statement
                System.out.println("main end");
                ^
1 error
*/