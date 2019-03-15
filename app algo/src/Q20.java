//20. find out factorial value for a given number?
class Q20
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
		System.out.println("enter 1 cla");
		return;
		}
		int num1 = Integer.parseInt(args[0]);
		int i = num1,factorialValue = 1;
		while (i != 0)
		{
			factorialValue = factorialValue * i;
			i--;
		}
		System.out.println("factorial value for" + num1 + "is" + factorialValue);
	}
}
