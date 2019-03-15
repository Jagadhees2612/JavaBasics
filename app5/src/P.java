class P
{
	public static void main(String[] args) 
	{
		System.out.println("Main Beging");
		if(true)
		{
			System.out.println("if1 Beging");
			if(true)
			{
				System.out.println("if2 Beging");
				if(false)
				{
					System.out.println("if3");
				}
				System.out.println("if2 end");
			}
			System.out.println("if1 end");
		}
		System.out.println("Main end");
	}
}
