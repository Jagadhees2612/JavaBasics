class M21
{
	public static void main(String[] args) 
	{
		System.out.println(test(1));
	}
	public static int test(int i)
	{
		if(i==9) //2+3+...+9=44
		{
			return 0;
		}
		return ++i + test(i);
	}
}
/*
o/p:
44
*/


/*
class M21
{
	public static void main(String[] args) 
	{
		System.out.println(test(1));
	}
	public static int test(int i)
	{
		if(i==9) //1+2+3+...+8=36
		{
			return 0;
		}
		return i++ + test(i);
	}
}


/*
o/p:
36
*/