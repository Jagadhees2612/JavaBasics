class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 100;
		for(System.out.println("INIT"),i =1; i <= 5,System.out.println("BOOLEAN CONDN") i++,System.out.println("CHANGE")) //comma is not allowed in boolean exp.
		{
           System.out.println("loop body:" +i);

        }
		System.out.println("main end:" +i);
    }
}

/*
output:
compile time error in line 7
*/