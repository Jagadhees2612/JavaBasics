class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
		System.out.println("if block");
		}
		else if(false)	
		{
			System.out.println("else if block");
		}
		else if(false) // if inside else part
		{
			System.out.println("else else if block");
		}
		else
		{
			System.out.println("else else else block");
		}	
		System.out.println("main end");
	}
}
