class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i =1, j =10; i <= 5 || j >= -5; i++, j -= 2)//if aany one condition is passing boolean true..ucan go for comma and or
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
loop body:6,0
loop body:7,-2
loop body:8,-4
*/