class I 
{
	I()
	{
		this(9);
	}
	I(int x)
	{
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("hello world!");
	}
}
/*
o/p:
I.java:7: error: recursive constructor invocation
        I(int x)
        ^
1 error
*/
