class D1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1; 
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
do while :1
do while :2
do while :3
do while :4
do while :5
main end:6
*/