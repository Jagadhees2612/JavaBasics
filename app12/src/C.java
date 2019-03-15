class C
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
		while (i <= 5);
		System.out.println("main end:" +i);
	}
}

/*
o/p:
main begin
do while :20
main end:21
*/