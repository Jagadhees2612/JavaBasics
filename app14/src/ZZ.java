class ZZ
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test1(i++) + i   +   i++  +   test1(++i)   +   i   +    ++i     +   test1(i--)    +   i   +   test1(--i)   +  i;
		System.out.println(i +"," +j);
	}
	public static int test1(int i)
	{
		return i++  +  i  +   test2(i++)   +   i;
	}
	public static int test2(int i,int j)
		{
		return i++   +  i   +   j++  +   j;
	}
}