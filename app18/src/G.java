class G 
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		G g1 = new G();//
		g1.test();
		System.out.println("main end");
	}
}
/*
o/p:
main begin
from test
main end
*/
