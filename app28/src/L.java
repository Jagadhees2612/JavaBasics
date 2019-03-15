abstract class A
{
	abstract void test1();//non private is not inherit..
}
abstract class B extends A
{
}
class L
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

// o/p: done