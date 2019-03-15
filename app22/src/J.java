class I 
{
	int x;
	int y;
}
class J  //has relation so I mem cant able to use in the J //j is the whole and i is the part...cant accrss x n y is in the j is not use in the straight away
{
	I obj = new I();
	void test1()
	{
		System.out.println("from test1:" +x+ "," +y);
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.test1();
		System.out.println("done");
	}
}
