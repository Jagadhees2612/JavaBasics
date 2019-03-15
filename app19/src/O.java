class O 
{
	O(int i,int j)
	{
		System.out.println("O(int, int)");
	}
	O(double i,int j)//total 4  cons are properly overloading..every cons can be data type of the  arg....
	{
		System.out.println("O(double, int)");
	}
	O(int i,double j)
	{
		System.out.println("O(int, double)");
	}
	O(double i,double j)
	{
		System.out.println("O(double, double)");
	}
	public static void main(String[] args) 
	{
		O ref1 = new O(10,20);
		System.out.println("-------");
		O ref2 = new O(10.5,20);
		System.out.println("-------");
		O ref3 = new O(10.5,200);
		System.out.println("-------");
		O ref4 = new O(10,20.9);
		System.out.println("-------");
		O ref5 = new O(10,20);
		System.out.println("-------");
	}
}

/*
o/p:
O(int, int)
-------
O(double, int)
-------
O(double, double)
-------
O(int, double)
-------
O(int, int)
-------
*/