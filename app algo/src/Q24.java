//24.develop a program to print prime numbers
// between two given numbers?
class Q24
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("pls supply 2 cla");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		boolean  isPrime = true;
		for(int i = num1; i <= num2; i++)
		{
			for(int j = 2;j <= (i /2); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i + ",");
			}
			isPrime = true;
		}
	}
}
