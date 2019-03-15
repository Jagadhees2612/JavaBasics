class H
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
while end :1,11
while begin :1,12
while end :1,12
while begin :1,13
while end :1,13
do while end :1
do while begin:2
while begin :2,10
while end :2,10
while begin :2,11
while end :2,11
while begin :2,12
while end :2,12
while begin :2,13
while end :2,13
do while end :2
do while begin:3
while begin :3,10
while end :3,10
while begin :3,11
while end :3,11
while begin :3,12
while end :3,12
while begin :3,13
while end :3,13
do while end :3
do while begin:4
while begin :4,10
while end :4,10
while begin :4,11
while end :4,11
while begin :4,12
while end :4,12
while begin :4,13
while end :4,13
do while end :4
do while begin:5
while begin :5,10
while end :5,10
while begin :5,11
while end :5,11
while begin :5,12
while end :5,12
while begin :5,13
while end :5,13
do while end :5
do while begin:6
while begin :6,10
while end :6,10
while begin :6,11
while end :6,11
while begin :6,12
while end :6,12
while begin :6,13
while end :6,13
do while end :6
main end:7
*/