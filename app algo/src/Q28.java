//28. develop a program to print prime numbers
// in the reverse order from 70 to 20?
class Q28
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		for(int i = 70; i >= 20; i--)
		{
			for(int j =2; j <=(i / 2);j++)
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

/*
o/p:
67,
61,
59,
53,
47,
43,
41,
37,
31,
29,
23,
*/