class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
		System.out.println("if block");
		}
		else
		{
			System.out.println("else begin");
		    if(false)
			{
				System.out.println("else if block");
			}
			else
			{
				if(false)
				{
					System.out.println("else else if block");
				}
				else
				{
					System.out.println("else else else block");
				}
			}
			System.out.println("else end");

		}
		System.out.println("main end");
	}
}
