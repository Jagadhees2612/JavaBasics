class Z 
{
	Z()
	{
		Z z1 = new Z();//dont create obj on iib for the same class..
	}
	public static void main(String[] args) 
	{
		Z obj = new Z();
		System.out.println("Hello World!");
	}
}

//O/P:  stack overflow error..