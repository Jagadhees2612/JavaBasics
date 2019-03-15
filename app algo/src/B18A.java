class B18A 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int sum=0;
		while (num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
}

/*
o/p:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at B18A.main(B18A.java:5)
*/