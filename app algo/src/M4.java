class M4
{
	public static void main(String[] args) 
	{
	test(1);
	}
	public static void test(int i) 
	{
		System.out.println("Hello worid");
	    if(i==3)
		{
		 return;
	    }
		
		i++;
		test(i);
	}
}

// pre recursive- execuiting before recursive statement.
/*
o/p:
Hello worid
Hello worid
Hello worid
*/