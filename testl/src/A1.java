class A1 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply 1 cla");
		return;
		}
	int num = Integer.parseInt(args[0]);
	int i = num;
	int sum = 0;
	for(i = 1;i < num; i++)
	{
		if (num % i == 0)
		{
			sum = sum + i;
		}
	}
	if (sum == num)
	{
		System.out.println(num+ ":is perfect number");
	}
	else
	{
		System.out.println(num+ ": is not perfect number");
	}
	}
}
