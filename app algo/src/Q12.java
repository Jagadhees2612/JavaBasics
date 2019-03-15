
//12.find out whether digits are in raising order or not in a given number?
/*
  example1: 12345 (yes)
  example2: 12745 (no)
  example3:  368 (yes)
  example4: 361 (no)
  example5: 2579 (yes)
  example6: 2574 (no)
  */



  class Q12
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		System.out.println("enter 1  cla");
		return;
		}
	    int num = Integer.parseInt(args[0]);
		boolean isRaisingOrder = true;
		//num =12345
		int i =num, currentDigit, prevDigit = num % 10;
		       //12345                  5       12345-->5
		i = i / 10;
		//12345--->  1234
		while(i != 0)
		{
			currentDigit = i % 10;
			//4  3       =   5   4
			if(prevDigit <  currentDigit)
				//5  4           4  3
			{
				isRaisingOrder = false;
				break;
			}
			//prevDigit = currentDigit;
			//5    =      4
			i = i /10;

		}
		System.out.println("is digits of" + num + "are in RaisingOrder:" +isRaisingOrder);
	}
}
		