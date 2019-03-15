class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =5;
		while(i++ <= 10);
			System.out.println("while-stmt1:" +i++);
			System.out.println("while-stmt2:" +i++);
			System.out.println("while-stmt3:" +i++);
		System.out.println("main end:" +i);
	}
}
/*
o/p:
main begin
while-stmt1:12
while-stmt2:13
while-stmt3:14
main end:15
*/