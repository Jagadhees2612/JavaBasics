// printing 1 to 10 throgh post recursion
class M30 
{
	public static void main(String[] args) 
	{
		test(11);
	}
	public static int test(int i)
	{
		if(i==1)
		{
	    return;
	    }
		i--;
		test(i);
		System.out.println(i);

	}
}

/*
o/p:
1
2
3
4
5
6
7
8
9
10
*/