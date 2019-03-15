class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i, j;
		for(i =1, j =10; i <= 5 && j >= -5; i++, j -= 2)
		{
           System.out.println("loop body:" +i+","+j);
		}
    }
}

/*
main begin
loop body:1,10
loop body:2,8
loop body:3,6
loop body:4,4
loop body:5,2
*/