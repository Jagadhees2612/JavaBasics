class M15 
{
	public static void main(String[] args) 
	{
		test(6);
	}
    public static void test(int i)
	{
		if(i==-1)
		{
			return;
		}
		System.out.println(i);
		i--;
		test(i);
	}
}


/*
o/p:
6
5
4
3
2
1
0
*/