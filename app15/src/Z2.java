import java.util.Arrays;
class Z2
{
	static int i=test();

	public static int test() 
	{
		System.out.println("from test");
		main(null); // null value
		System.out.println("-------------");
		main(new String[]{});
		System.out.println("-------------");
        main(new String[]{"hello","xyz"});
		return 100;
	}

	public static void main(String[] args) 
	{
		i+=1;
		System.out.println("from main:"+i+","+Arrays.toString(args));
	}
}

/*
from test
from main:1,null
-------------
from main:2,[]
-------------
from main:3,[hello, xyz]
from main:101,[]
*/