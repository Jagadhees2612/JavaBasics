class C
{
	void test1()
	{
		System.out.println("c-test1");
	}
}
class D extends C
{
	void test2()
	{
		System.out.println("D-test2");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		System.out.println("---"); // extends n implements
		d1.test2();
	}
}
/*
o/p:
c-test1
---
D-test2
*/