// 26. develop a program tom prrint sum of initial 30 prime numbers?
class Q26 
{
	public static void main(String[] args) 
	{
		int i = 3;
		int count = 1;
		int sum = 2;
		boolean isPrime = true;
		while(count < 30)
		{
			for(int j =2; j <= (i/j); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				sum += i;
				count ++;
			}
			isPrime = true;
			i++;
		}
		System.out.println("sum of the initial 30 prime numbers:" +sum);
	}
}

/*
o//p:
C:\javaC\jan30\app algo\src>java -cp ../classes Q26
sum of the initial 30 prime numbers:1593
*/