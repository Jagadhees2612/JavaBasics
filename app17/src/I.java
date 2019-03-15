class I 
{
	static
	{
		System.out.println("I.SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("I.main begin");
		G.main(args);//call the another class in this class 
		System.out.println("I.main end");
	}
}
