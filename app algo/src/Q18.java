//18. assume total no of digits in a given num is even.
//reverse only first half of thhe given num.
class Q18
{
	public static void main(String[] args) 
	{
		if (args.length < 1)
		{
			System.out.println("pls enter 1 cammand line args");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num,j = num; //123456
		//find out the total no of digit
		int digitsCount = 0;
		while (i != 0)
			{
				digitsCount ++;
			    i = i/10;
			}
		    System.out.println("digitsCount:"  + digitsCount);//6
		    //reversing a number
			int reversenum = 0,currentdigit;
			while(j != 0)
		{   

		//reversing 1st half number
		//--------------------
		int factor =1;
		for ((int Z = 1;z <= (digitscount /2);z++)
		{
			factor = factor * 10;
		}//1000
		int firsthalf = num / factor;  //123456 /1000;
		int secondhalf = num % factor;
		//reversing first half
		int m = firsthalf; //123
		int reversehalf =0;
		while(m!=0);
	}
		System.out.println("first half:"  + reversehalf);//321
		//reverse second half
		m = secondhalf; //456
		int revsecondhalf = 0;
		while ( m!=0)
		{
		}

		System.out.println("revsecondhalf:" +revsecondhalf);//
		//reversing only first half
		//add second reversed one to the first in the reverse order
		//321456
		int finalnumwithonlyfirsthalf = 
}
		//reversing only second half
		//add second half to the first half in the reverse order
		int finalnumwithrevonlysecondhalf = firsthalf;  //123456
		m(m != 0)
		{
			currentdigit = m % 10;
			finalwithrevnumonlysecondhalf =
				(finalnumwithrevonlysecondhalf * 10) + currentdigit;
			m = m / 10;
		}
		System.out.println("finalnumwithrevonlysecondhalf:" + finalnumwithrevonlysecondhalf);
	}
}
