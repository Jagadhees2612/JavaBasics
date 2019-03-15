class A
{
	static int i;
}
class M
{
	public static void main(String[] args) 
	{
		System.out.println("main:" +A.i);
	}
}

/*
o/p:
main:0
*/