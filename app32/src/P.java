class P 
{
	public static void main(String[] args) 
	{
		double d1 = 2.9;
		int i = (int) d1;//bcoz of expilicit narrowing
		System.out.println(i);//trimming 2.9 to 2.
	}
}
//O/P: 2