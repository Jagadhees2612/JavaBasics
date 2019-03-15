class Z
{
	static int i=test();

	public static int test() 
	{
		System.out.println("from test");
		main(null); // null value
		System.out.println("-------------");
		main(new String[]{}); // empty String Array(physical String object)
		return 100;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:"+i+","+args);
	}
}

// output

from test
from main:0,null
-------------
from main:0,[Ljava.lang.String;@1db9742  //string address(always in hexadecimal) in memory
from main:100,[Ljava.lang.String;@106d69c