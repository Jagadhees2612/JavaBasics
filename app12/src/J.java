class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1; 
		outer:
		do
		{
			System.out.println("do while begin:" +i);
			int j = 10;
			while(j <= 13)
			{
				System.out.println("while begin :" +i+","+j);
				if(j ==11)
				{
					break outer;
				}
				System.out.println("while end :" +i+","+j);
				j++;
			}
			System.out.println("do while end :" +i);
		}
		while (i++ <= 5);
		System.out.println("main end:" +i);
	}
}

/*
o/p:
C:\javaC\jan30\app//for n while loop also can be use to 
main begin
do while begin:1
while begin :1,10
while end :1,10
while begin :1,11
main end:1
*/