class S 
{
	int i;
	int j;
	static int p;
	static int q;

	void test1()
	{
		System.out.println("from S.test1");
	}
	static void test2()
	{
		System.out.println("from S.test2");//initializers are not inheritant to supplies
	}
}
class T extends S
{
		void test3()
		{
			System.out.println(i+ "," +j+ "," +p+ "," +q);///no initializer inheriting to the supplies
			test1();
			test2();
		}

	public static void main(String[] args) 
	{
		T t1 = new T();
		t1.test1();
		T.test2();
		test2();
		t1.test3();
		System.out.println(t1.i + "," +t1.j);
		System.out.println(p + "," + q);
		System.out.println(T.p + "," + T.q);
	}
}

/*
o/p:
from S.test1
from S.test2
from S.test2
0,0,0,0
from S.test1
from S.test2
0,0
0,0
0,0
*/