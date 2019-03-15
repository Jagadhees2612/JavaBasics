class C
{
	static int i=200;  //initializer
	public static void main(String[] args) 
	{
		System.out.println(i);
		i=10; //reintialized
		System.out.println(i);
	}
}

/*
o/p:
200
10
*/