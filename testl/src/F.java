//64.given number is factorial or not?
class  F
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		System.out.println("enter 1 cla");
		return;
	}
	int num1 = Integer.parseInt(args[0]);
	int i = num1, factorialValue = 0;
	while(i != 0)
	{
		factorialValue = factorialValue * i;
		i--;
	}
	System.out.println("factorial num for:" +num1+ ":" +factorialValue);
}
