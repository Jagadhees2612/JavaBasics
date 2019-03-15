class R 
{
	R()
	{
		int i =200;// by usuing this is 1st condition statement to call 1st const to another constr this calling statement... 
		this(90);
	}
	R(int x)
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
o/p:
R.java:6: error: call to this must be first statement in constructor
                this(90);
                    ^
1 error
*/