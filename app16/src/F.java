class F 
{
	static int i =F.j; //indirect read is allowed before noyifying..
	static int j =10;
	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
}

/*
o/p:
0,10
*/