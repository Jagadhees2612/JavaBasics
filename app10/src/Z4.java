class Z4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 100;
		for(System.out.println("INIT"),i =1; test(i); i++,System.out.println("CHANGE")) 
		{
           System.out.println("loop body:" +i);//boolean conditon is 

        }
		System.out.println("main end:" +i);
    }
	static boolean test(int i)
	{
		boolean b1 = i < 5;
		System.out.println("BOOLEAN CONDN RESULT FOR" +i +" is : " +b1);
		return b1;
	}
}
/*
output:
main begin
INIT
BOOLEAN CONDN RESULT FOR1 is : true
loop body:1
CHANGE
BOOLEAN CONDN RESULT FOR2 is : true
loop body:2
CHANGE
BOOLEAN CONDN RESULT FOR3 is : true
loop body:3
CHANGE
BOOLEAN CONDN RESULT FOR4 is : true
loop body:4
CHANGE
BOOLEAN CONDN RESULT FOR5 is : false
main end:5
*/
