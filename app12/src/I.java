class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1; 
		do
		{
			System.out.println("do while begin:" +i);
			int j = 10;
			while(j <= 13)
			{
				System.out.println("while begin :" +i+","+j);
				if(j ==11)
				{
					break;
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
main begin
do while begin:1
while begin :1,10
while end :1,10
while begin :1,11
do while end :1
do while begin:2
while begin :2,10
while end :2,10
while begin :2,11
do while end :2
do while begin:3
while begin :3,10
while end :3,10
while begin :3,11
do while end :3
do while begin:4
while begin :4,10
while end :4,10
while begin :4,11
do while end :4
do while begin:5
while begin :5,10
while end :5,10
while begin :5,11
do while end :5
do while begin:6
while begin :6,10
while end :6,10
while begin :6,11
do while end :6
main end:7
*/
