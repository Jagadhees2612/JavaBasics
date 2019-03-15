class M16
{
	public static void main(String[] args) 
	{
		test(6);
	}
    public static void test(int i)
	{
		System.out.println(i);
		if(i==0)
		{
			return;
		}
		
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