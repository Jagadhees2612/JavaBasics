class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		while (i <= 5)//ther is a fixed location
		{
		    System.out.println("while loop body");
			i++;
	    }
	    System.out.println("main end:" +i);
	}
}

/*
o/p:
main begin
while loop body
while loop body
while loop body
while loop body
while loop body
main end:6
*/