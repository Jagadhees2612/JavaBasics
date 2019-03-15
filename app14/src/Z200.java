class Z200
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++) + i   +   i++  +   test1(++i)   +   i   +    ++i     +   test1(i--)    +   i   +   test1(--i)   +  i  +
		        test2(i++) + i   +   i++  +   test2(++i)   +   i   +    ++i     +   test2(i--)    +   i   +   test2(--i)   +  i  +
				test3(i++) + i   +   i++  +   test3(++i)   +   i   +    ++i     +   test3(i--)    +   i   +   test3(--i)   +  i  +
				test4(i++) + i   +   i++  +   test4(++i)   +   i   +    ++i     +   test4(i--)    +   i   +   test4(--i)   +  i;
		//         1        2       2          4              4         5          5                4         3              3
		 //        3        4       5          6              6         7          7                6         5              5
		 //        5        6       7          8              8         9          9                8         7              7
		 //        7        7       7          8              8         9          9                8         6              5
		System.out.println(i +"," +j);
	}
	public static int test1(int i)
	{
		return i++  +  i  +   test2(i++)   +   i;
	}
	public static int test2(int i)
	{
		return ++i  +  i  +   test3(++i)   +   i;
	}
	public static int test3(int i)
	{
		return --i   + i  +   test4(i--)   +   i;
	}
	public static int test4(int i)
	{
		return i--   +  i  +   test5(--i, i--)  +   i;
	}
	public static int test5(int i,int j)
	{
		return i++   +  i   +   j++  +   j;
	}
}

/*
9,1146
*/