class F 
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println("main begin");
		if(false)
		{
			i=i+30;
			System.out.println("if block start1");
			System.out.println("if block start2");
		}
		else
		{
			i=i+60;
			System.out.println("else start 1");
			System.out.println("else start 2");
		}
		System.out.println("main end"+i);
	}
}
