class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
		    System.out.println("if1 block beging");
			if(false)
			{
				if(true)
					System.out.println("if3 block");
			    else
				    System.out.println("else3 block");

			}
			else
			{
				System.out.println("else2 block");
			}
			System.out.println("if1 block end");
		}
		else
		{
			System.out.println("else1 block");
		}
		System.out.println("main end");
	}
}
