//21.develop a program to find out given number is a
// prime or not?
class Q21
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter 1 cla");
			return;
		}
		int num1 = Integer.parseInt(args[0]); //11
		boolean isprime = true;
		for(int i =2; i <= (num1 / 2); i+n+)
		{
			if(num1 % i ==0)
			{
				isprime = false;
				break;
			}
		}
		if (isprime)
		{
			System.out.println(num1 + " is a prime number");
		}
		else
		{
		System.out.println(num1 +"is not a prime number");
		}
	}
}
