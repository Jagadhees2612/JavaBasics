class M19 
{
	public static void main(String[] args) 
	{
         System.out.println(test(8));
	}
    public static int test(int i)
	{
     int sum=0;
	 for(int j=1;j<=i;j++)
	 {
		 sum=sum+j;
	 }
	 return sum;
	}
}

/*
o/p:
36
*/