class A 
{
	static int i;
	static
	{
		System.out.println("A-SIB1");
	}
	static
		{
		System.out.println("A-SIB2");//whwnever p is loading into the memory a is not loading into the mem..
		}
}
class  Q
{
	static
	{
		System.out.println("Q-SIB1");//whenever class is 1st time 
	}
	static
	{
		System.out.println("Q-SIB2");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("main end");
	}
}
/*
o/p:
Q-SIB1
Q-SIB2
main begin
A-SIB1
A-SIB2
0
main end
*/
