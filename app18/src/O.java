class O 
{
    int i;
    static void test()  //while using if we r usuing the  callwer static mem compiler replaces to ref var to class name...
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		O ref1 = new  O();
		System.out.println(ref1.i);
		test();
		O.test();
		ref1.test();   //O.test()
	}
}

/*
o/p:
0
from test
from test
from test
*/