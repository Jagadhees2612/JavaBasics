class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		while (i <= 5)
		{
		    System.out.println("while loop body begin:" + i);
			for(int j=100;j <= 103; j++)
			{
				 System.out.println("while loop begin:" + i + "," +j);
				 if(j == 101)
				{
					 continue;
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
C:\javaC\jan30\app12\src>j
main begin
while loop body begin:1
while loop begin:1,100
while loop end:1,100
while loop begin:1,101
while loop begin:1,102
while loop end:1,102
while loop begin:1,103
while loop end:1,103
while loop body end:1
while loop body begin:2
while loop begin:2,100
while loop end:2,100
while loop begin:2,101
while loop begin:2,102
while loop end:2,102
while loop begin:2,103
while loop end:2,103
while loop body end:2
while loop body begin:3
while loop begin:3,100
while loop end:3,100
while loop begin:3,101
while loop begin:3,102
while loop end:3,102
while loop begin:3,103
while loop end:3,103
while loop body end:3
while loop body begin:4
while loop begin:4,100
while loop end:4,100
while loop begin:4,101
while loop begin:4,102
while loop end:4,102
while loop begin:4,103
while loop end:4,103
while loop body end:4
while loop body begin:5
while loop begin:5,100
while loop end:5,100
while loop begin:5,101
while loop begin:5,102
while loop end:5,102
while loop begin:5,103
while loop end:5,103
while loop body end:5
main end:6
*/
