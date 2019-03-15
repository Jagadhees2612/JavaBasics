class A 
{
	int i;// i got inhertent from a mem inheritend  to b...
}
class B extends A
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i + "," +b1.j); // extends n implements
	}
}

//o/p: 0,0