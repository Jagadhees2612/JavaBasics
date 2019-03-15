class G
{
	public static void main(String[] args) //method defenition
	{
		System.out.println("main begin");
		test1();
		System.out.println("--------");
		test2();
		System.out.println("--------");
		test1();
		System.out.println("main end");
	}
	public static void test1() 
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	public static void test2() 
	{
		System.out.println("from test2");
	}
}

/*
o/p:
main begin
test1 begin
from test2
test1 end
--------
from test2
--------
test1 begin
from test2
test1 end
main end
*/