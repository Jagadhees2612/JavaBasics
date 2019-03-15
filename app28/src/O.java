abstract class A
{
	abstract void test1();
}
class B extends A //iside a b no doesnt req an abstr..
{
	void test1()
	{
		System.out.println("test1");
	}
}
class O
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		System.out.println("done");
	}
}

/*
o/p:
test1
done
*/