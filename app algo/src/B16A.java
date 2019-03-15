// sum of all digit of a No. by recursive algo
class B16A 
{
	static int sum=0;
	public static void main(String[] args) 
	{
		int num=345671239;
	    calculateSum(num);
		System.out.println(sum);
	}
    public static void calculateSum(int num)
	{
		if (num==0)
		{
			return;
		}
		sum=sum+(num%10);
		num=num/10;
		calculateSum(num);
	}
}


/*
o/p:
9,3,2,1,7,6,5,4,3,Hello World!
*/