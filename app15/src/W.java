class W
{
	static int i=test(); 
	static int j=test(); 

	public static int test() 
	{
		System.out.println("from test"+i+","+j);
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:"+i+","+j);
	}
}
