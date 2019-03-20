interface A
{
	void test1();
}
interface B
{
	void test2();//test methjods
}
interface C
{
	void test3();
}
class F implements A,B,C//f class not implement the all methods
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/* 
o/p:
F.java:13: error: F is not abstract and does not override abstract method test1(
) in A
class F implements A,B,C
^
1 error
*/