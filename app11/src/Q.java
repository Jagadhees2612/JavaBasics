class  Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =5;
		while(i <= 10)
			System.out.println("while-stmt1:" +i++);
		System.out.println("main end:" +i);
	}
}

/*
o/p:
main begin
while-stmt1:5
while-stmt1:6
while-stmt1:7
while-stmt1:8
while-stmt1:9
while-stmt1:10
main end:11
*/