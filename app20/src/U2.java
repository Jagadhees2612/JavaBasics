class U2 
{
	int  test()
	{
		return j;
	}

	int i = test();
	int j = 10;
	public static void main(String[] args) 
	{
		U2 u1 = new U2();
		System.out.println(u1.i + "," + u1.j);
	}
}
//o/p:    0, 10