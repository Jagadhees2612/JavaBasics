 //17.find out given number is a palindrom or not?
  class Q16
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		  System.out.println("enter 1 cla");
		  return;
		}
	    int num = Integer.parseInt(args[0]);
	    int i = num, reverseNum = 0, digit;
		while(i != 0)
		{
			digit = i % 10;//121----> 1   1
			reverseNum = reverseNum * 10 + digit; /// 0 * 10 + 1 =12
			i = i / 10;  // 121 -----> 1
		}
		if(num == reverseNum)
		{
		System.out.println(num+ "is a palindrom");
		}
		else
		{
		   System.out.println(num + "is not  palindrom");
		}
	}
}

/*
o//p:
C:\javaC\jan30\app algo\src>java -cp ../classes Q16 789678
reverse of789678:876987
*/