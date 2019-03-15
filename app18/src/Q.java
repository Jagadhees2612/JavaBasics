class Q
{
	static int i;
	static void test(Q arg)
	{
		System.out.println("from test:" +arg);
		System.out.println("from test:" +arg.i);//200
		arg.i += 100;
		return;
	}
	public static void main(String[] args) 
	{
		Q ref = new Q(); //we r creating 1 obj then it is used to multiple times
		ref.i =100;
		System.out.println("from main:" + ref);
		System.out.println("from main1:" + i);
		test(ref);
		System.out.println("from main2:" + ref.i); //200
		ref.i +=100; //test method 300 become
		Q.test(ref);
        System.out.println("from main3:" + ref.i);
		ref.i += 100;
		ref.test(ref);    // Q.test(ref)
		System.out.println("from main4:" + ref.i);
		return;
	}
}

/*
o/p:
from main:Q@15db9742
from main1:100
from test:Q@15db9742
from test:100
from main2:200
from test:Q@15db9742
from test:300
from main3:400
from test:Q@15db9742
from test:500
from main4:600
*/