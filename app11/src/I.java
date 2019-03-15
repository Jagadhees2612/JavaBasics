class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		while (i <= 5)
		{
		    System.out.println("while loop body begin:" + i);
			if(i >=3)
			{
				i++;
				break;
			}
		    System.out.println("while loop body end:" + i);
			i++;
	    }
	    System.out.println("main end:" +i);
	}
}

/*
o/p:
main begin
while loop body begin:1
while loop body end:1
while loop body begin:2
while loop body end:2
while loop body begin:3
main end:4
*/S