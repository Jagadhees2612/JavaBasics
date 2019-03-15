class X
{
	X()
	{
		System.out.println("W():" + i);
	}

	{
		X x1 = new  X();
		System.out.println("IIB:" +x1.i);
	}

	int i;

	public static void main(String[] args) 
	{
		System.out.println("done");
		X obj = new X();
	}
}


//o/p:  stack overflow error....