class M19sir 
{
	static int sum=0;
	public static void main(String[] args) 
	{
		test(1);
		System.out.println(sum);
	}
	public static void test(int i)
	{
		if(i==9)
		{
			return;
		}
		sum=sum+i;
		i++;
		test(i);
	}
}


/*
o/p:
36
*/