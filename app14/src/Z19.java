class Z19 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++) + i   +   i++  +   test1(++i)  +   i   +    ++i   +   test1(i--)    +   i;
		//          1        2       2          4              4         5          5                4
		System.out.println(i +"," +j);
	}
	public static int test1(int i)
	{
		return ++i +  ;
	}
}

/*
o/p:
4,30
*/