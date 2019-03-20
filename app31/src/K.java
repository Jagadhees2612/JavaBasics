class A 
{
	void test()
	{
		System.out.println("superclass -test()");
	}
}
class K extends A  //while ovrriding same signature then only attempt in the overriding..
{
	void test()
	{
		System.out.println("subclass-test()");
	}
	public static void main(String[] args) 
	{
		K obj = new K();
		obj.test();//got K class test mtd..not A clas test mtd..
		System.out.println("done");
	}
}

/*
O/P:
subclass-test()
done
*/