class P 
{
	int i;
	static void test(P p1)
	{
		System.out.println("from test:" +p1);
		System.out.println("from test:" +p1.i);
	}
	public static void main(String[] args) 
	{
		P ref = new P();
		ref.i =100;
		System.out.println("from main:" + ref);
		System.out.println("from main:" + ref.i);
		test(ref);
		P.test(ref);
		ref.test(ref);    // p.test(ref)
	}
}

/*
o/p:
from main:P@15db9742
from main:100
from test:P@15db9742
from test:100
from test:P@15db9742
from test:100
from test:P@15db9742
from test:100
*/