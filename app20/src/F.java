class F 
{
	F()
	{
		this(90);
		System.out.println("F()");//iib execting is obj wise
	}

	F(int i)
	{
		System.out.println("F(int)");//iib is not a constructor wise..no matter how many cons r execting 1 obj means 1 time iib..
	}

	{
		System.out.println("F-IIB");//iib was execut 1 time for one obj execution....
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("---------");
		F f2 = new F(90);
	}
}

/*
o/p:
F-IIB
F(int)
F()
---------
F-IIB
F(int)
*/