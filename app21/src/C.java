class A 
{
	int i;
}
class C
{
	public static void main(String[] args) 
	{
		//System.out.println(i);i is not avail in the main method
		//C c1 = new C();
		//System.out.println(c1.i);i is not in the c class
		A a1 = new A();
		System.out.println(a1.i);
	}
}

//o/p:  0