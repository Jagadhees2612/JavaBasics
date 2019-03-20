abstract class A
{
	abstract void test();
}  
abstract class I extends A
{
	void test(int i)
	{
		System.out.println("test(int)");//inside i  class abstract..
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

///O/P:   done
