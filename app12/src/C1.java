class C1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20; 
		do
		{
			System.out.println("do while :" +i);
			i++;
		}
		while (i <= 5)
		System.out.println("main end:" +i);
	}
}


/*
o/p:
C.java:12: error: ';' expected
                while (i <= 5)
                              ^
1 error
*/