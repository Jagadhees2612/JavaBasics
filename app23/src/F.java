class E 
{
	E(int i)
	{
		System.out.println("E(int)");
	}
}
class F extends E
{
	F (int i)
	{
		super(90);
		System.out.println("F(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main begin");
	}
}

/*
o/p:
main begin
main begin
*/