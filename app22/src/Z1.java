class A 
{
	A(int i)
	{
	}
}
class Z1 extends A
{
	Z1()
	{
		super(10);//compiler required super with no arg
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
o/p:
Hello World!
*/