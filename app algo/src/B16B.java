// sum of all digit of a No. by recursive algo
class B16B 
{
	public static void main(String[] args) 
	{
		int num=345671239;
		int sum=calculateSum(num);
		System.out.println(sum);
	}
    public static int calculateSum(int num)
	{
		if (num==0)
		{
			return 0;
		}
		return (num%10)+calculateSum(num/10);
	}
}
