// sum of all digit in a given No.
class B15  
{
	public static void main(String[] args) 
	{
		int num=1234567,sum=0,digit;
		for (;num==0;num=num/10)
		{
			digit=num%10;
			sum=sum+digit;
		}
		System.out.println(sum);
	}
}

/*
o/p:
28
*/