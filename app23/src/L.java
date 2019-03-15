class L 
{
	L()
	{
		System.out.println("L()");//in the 1st ste is spr caling state ..//transpering into the iib content the constructor body..
	}

	{
		System.out.println("L-IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj = new L();
		System.out.println("main end");
	}
}

/*
o/p:
main begin
L-IIB
L()
main end
*/