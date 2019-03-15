class V
{
	static int i=test(); // initialization
	static int j=test(); // initialization

	public static int test() 
	{
		System.out.println("from test");
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:"+i+","+j);
	}
}

// all initializer execuite before main method execution.