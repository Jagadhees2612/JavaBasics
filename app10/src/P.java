class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i = 5;
		for(i =15; i<=10; i++)    //i already intialized 5..but it initializing i =1 in loop//
        {
           System.out.println("loop body:" +i);
        }
		System.out.println("main end:" +i);
    }
}

/*
output
main begin
main end:15
*/