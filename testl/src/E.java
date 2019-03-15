//63.print if given num is palindrome or not?
class E 
{
	public static void main(String[] args) 
	{
		if(args.length < 1 )
		{
			System.out.println("pls supply 1 cla");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num, revnum = 0, digit;
		while (i != 0)
		{
			digit = (i % 10);
		    revnum = revnum * 10 + digit;
            i = i / 10;
		}
		if(num == revnum)
		{
			System.out.println(num+ ":is a palindrome");
		}
		else
		{
			System.out.println(num+ ":is not a palindrome");
		}
	}
}

