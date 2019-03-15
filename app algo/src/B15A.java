// read digit one by one from right to left
class B15A 
{
	public static void main(String[] args) 
	{
		int num=345671239;
	    printDigit(num);
		System.out.println("Hello World!");
	}
    public static void printDigit(int num)
	{
		if (num==0)
		{
			return;
		}
		System.out.print(num%10+",");
		num=num/10;
		printDigit(num);
	}
}

/*
o/p:
9,3,2,1,7,6,5,4,3,Hello World!
*/
