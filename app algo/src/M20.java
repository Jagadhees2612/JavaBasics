class M20 
{
	static int sum=0;
	public static void main(String[] args) 
	{
		test(1);
		System.out.println(sum);
	}
	public static void test(int i)
	{
		sum=sum+i;
		if(i==8)
		{
			return;
		}
		
		i++;
		test(i);
	}
}


/*
o/p:
36
*/