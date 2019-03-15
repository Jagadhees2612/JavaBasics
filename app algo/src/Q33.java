//33. Develop a program to print numbers which should come
// after 3 non prime numbers. develop b/w 10 to 100
class Q33
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int nonPrimecount = 0;
	    for (int i = 10; i <= 100; i++)
			{
			for(int i = 10; i <= (i / 2); j++)
				{
				if(i % j == 0)
				{ 
					nonPrimeCount ++;
					isPrime = false;
					break;
				}
			}
			if(nonPrimeCount == 3)
				{
				System.out.println((i + 1) + ",");
				nonPrimeCount = 0;
				}
			}
			if(isPrime)
		{
				nonPrimeCount = 0;
		}
		isPrime = true;
	}
}
