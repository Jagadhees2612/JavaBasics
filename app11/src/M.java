class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		outerloop:
		while (i <= 5)
		{
		    System.out.println("while loop body begin:" + i);
			for(int j=100;j <= 103; j++)
			{
				 System.out.println("while loop begin:" + i + "," +j);
				 if(j == 101)
				{
					 break outerloop;
				}
				 System.out.println("while loop end:" + i + "," +j);
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
while loop begin:1,100
while loop end:1,100
while loop begin:1,101
main end:1
*/