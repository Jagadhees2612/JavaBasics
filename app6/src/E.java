class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if block start1");
			System.out.println("if block start2");
		}
		else
		{
			int i=10;
			System.out.println("else start 1");
			System.out.println("else start 2");
		}
		System.out.println("main end"+i);
	}
}
