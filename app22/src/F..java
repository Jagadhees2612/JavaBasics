class E
{
	int i;
	void test1()
	{
		System.out.println("E-test1");//sub class is a type of super class....f is a kind of E
	}
}
class F extends E   //is-a
{
	int j;
	void test2()
	{
		System.out.println("F-test2");
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i +"," + f1.j);
		f1.test1();
		System.out.println("---"); // extends n implements
		f1.test2();
		f1.i = 100;
		f1.j = 200;
		System.out.println(f1.i +"," + f1.j);
	}
}

/*
o/p:
0,0
E-test1
---
F-test2
100,200
*/