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
abstract class G implements A,B,C
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//o/p:  Hello World!