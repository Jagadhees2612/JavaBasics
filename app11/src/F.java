class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		while (i <= 5)
		{
		    System.out.println("while loop body begin:" + i);
			if(i ==3)
			{
				continue;
			}
		    System.out.println("while loop body end:" + i);
			i++;
	    }
	    System.out.println("main end:" +i);
	}
}

/*
o/p:
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3
while loop body begin:3 //infinite output
while loop body begin:3
*/
