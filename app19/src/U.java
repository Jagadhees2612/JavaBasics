class U 
{
	U()
	{
		this();//cyclic  innovation is not allowed in the  statement..
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");//thi s always in the 1st calling stateme
	}
}


/*
o/p:
 U.java:3: error: recursive constructor invocation
        U()
        ^
1 error
*/