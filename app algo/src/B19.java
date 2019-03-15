class B19 
{
	public static void main(String[] args) 
	{
		int num=Integer.parseInt(args[0]);
		int sum=findSum(num);
		System.out.println(sum);
	}
	static int findSum(int num) 
	{
		if (num==0)
		{
			return 0;
		}
		return (num%10)+findSum(num/10);
	}
}

/*
o/p:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at B19.main(B19.java:5)
		*/