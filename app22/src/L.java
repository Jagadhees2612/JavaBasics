class K
{
	int x;
	int y;
}
class L //has relation so I mem cant able to use in the J //j is the whole and i is the part...cant accrss x n y is in the j is not use in the straight away
{
	K obj = new K();
	void test1()
	{
		System.out.println("from test1:" +obj.x+ "," +obj.y);
	}
	public static void main(String[] args) 
	{
		L ref = new L();
		ref.test1();
		System.out.println("done");
	}
}

/*
o/p:
from test1:0,0
done
*/