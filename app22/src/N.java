class M 
{
	int x;
	int y;
}
class N
{
	M obj;//obj is not initialize ..
	void test1()
	{
		System.out.println("from test1:" + obj.x + "," + obj.y);
	}
	public static void main(String[] args) 
	{
		N ref = new N();
		ref.test1();
		System.out.println("done");
	}
}
