class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			if(false)
				if(true)
					System.out.println("if3 block");
			    else
				    System.out.println("else3 block");
			else
				System.out.println("else2 block");
		}
		else
		{
			System.out.println("else1 block");
		}
		System.out.println("main end");
	}
}
