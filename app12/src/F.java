class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1; 
		do
		{
			System.out.println("do while :" +i);
			if(i == 3)
			{
				continue;
			}
			System.out.println("do while end :" +i);
			i++;
		}
		while (i++ <= 5);
		System.out.println("main end:" +i);
	}
}

/*
o/p:
main begin
do while :1
do while end :1
do while :3
do while :4
do while end :4
do while :6
do while end :6
main end:8
*/