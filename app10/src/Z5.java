class Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");//one time data type then any num of var
		//int i = 1,j =5,k =6;
		for(int i = 1;System.out.println("INIT"); test(i); i++,System.out.println("CHANGE")) 
		{
           System.out.println("loop body:" +i);

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
compile time error in line 7
*/