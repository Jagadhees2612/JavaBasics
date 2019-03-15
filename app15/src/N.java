class N 
{
	static int i=10;
	public static void main(String[] args) 
	{
		int i=100;
		System.out.println(i);
		System.out.println(N.i);// if you wants to reffer global use class name
	}
}

/*
o/p:
100
10
*/