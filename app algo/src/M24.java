class M24 
{
	public static void test(int i)
	{
     if(i==6)
		{return;}
	    System.out.println("begin");
		System.out.println("end");
		i++;
		test(i);
	}
	public static void main(String[] args) 
	{
		test(1);
	}
}