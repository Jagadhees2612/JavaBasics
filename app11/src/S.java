class  S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =5;
		while(i <= 10);
			System.out.println("while-stmt1:" +i++);
			System.out.println("while-stmt2:" +i++);
			System.out.println("while-stmt3:" +i++);
		System.out.println("main end:" +i);
	}
}

/*
o/p:
main begin //it is infinite execution//
*/