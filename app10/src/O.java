class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i = 5;
		for(i = 1; i<=10; i++)    //i already intialized 5..but it initializing i =1 in loop//
        {
           System.out.println("loop body:" +i);
        }
		System.out.println("main end:" +i);
    }
}


/*
output
main begin
loop body:1
loop body:2
loop body:3
loop body:4
loop body:5
loop body:6
loop body:7
loop body:8
loop body:9
loop body:10
main end:11
*/