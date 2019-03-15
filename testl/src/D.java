//57.print true, if sum of any 2numbers is a 3rd given number..
class D
{
	public static void main(String[] args) 
	{
		if(args.length < 1 || args [0].length() !=3)
		{
			System.out.println("pls supply 1 cla with 3 digits number");
			return;
		}
int i = Integer.parseInt(args[0]);
int num = i;
int digit3 = i % 10;
i = i / 10;
int digit2 = i % 10;
i = i / 10;
int digit1 = i % 10;
   if( digit3 == (digit1 + digit2))
		{
	   System.out.println(num + ":is containing");
	   System.out.println(" given num is sum of first two numbers");
		}
		else
		{
	   System.out.println(num + ":is not containing");
	   System.out.println(" given num is sum of first two numbers");
		}
	}
}
	   
