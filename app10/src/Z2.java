class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 100;
		for(System.out.println("INIT"),i =1; i <= 5 ; i++,System.out.println("CHANGE")) //comma is separater for any no of condition
		{
           System.out.println("loop body:" +i);

        }
		System.out.println("main end:" +i);
    }
}

/*
output:
main begin
INIT
loop body:1
CHANGE
loop body:2
CHANGE
loop body:3
CHANGE
loop body:4
CHANGE
loop body:5
CHANGE
main end:6
*/