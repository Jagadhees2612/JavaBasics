abstract class A
{
	A()
	{
		System.out.println("A()");
	}
	abstract void test1();//obj cant be abstrs...2.is it ipossible to create obj n construct3.whn constru wil exect3..abst is min have 1 constr..
}//
class B extends A 
{
	void test1()
	{
		System.out.println("test1");
	}
}
class P
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
A()
test1
done
*/