class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    int i = 5;
		for(; i<=10;)
        {
           System.out.println("loop body:" +i);
		   i++;
        }
		System.out.println("main end:" +i);
    }
}


/*
main begin
loop body:5
loop body:6
loop body:7
loop body:8
loop body:9
loop body:10
main end:11