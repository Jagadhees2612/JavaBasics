class Z7 
{
	static int i = test1();
	static int j = test1() + test2();
	static
	{
		System.out.println("SIB:" +i+ "," +j);
		i += 1;
		j += 2;
	}
	public static int test1() 
	{
		System.out.println("test1:"+i+"," +j);
		i += 3;
		j += 4;
		return i + j + test2();// 7 & 57
	}
	public static int test2() 
	{
		System.out.println("test20A:"+i+","+j);
		i += 5;
		j += 6;
		main(null);
		System.out.println("test20B:"+i+","+j);
		return i + j;
	}
	public static void main(String[] args)
	{
		System.out.println("main:" +i+ "," +j);
		i += 7;
		i += 8;
	}
}

/*
o/p:
test1:0,0
test20A:3,4
main:8,10
test20B:15,18
test1:40,18
test20A:43,22
main:48,28
test20B:55,36
SIB:55,156
main:56,158
*/
