interface A
{
	void test1(); //ais  methd abstract methd autumaticaly ..
}
class B
{
	public void test1()
	{
		System.out.println("test1");
	}
}
class L extends B implements A
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj = new L();
		obj.test1();
		System.out.println("-----");
		System.out.println("main end");//interface methd class metd both are one n same 
	}
}

/*
O/P:
main begin
test1
-----
main end
*/