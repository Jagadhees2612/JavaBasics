class A 
{
	int i;
}
class D  //objn is non static mem of d...if it is a non static use ref var.. d has A 
{
	A obj;
	public static void main(String[] args) 
	{
		//System.out.println("obj");
		D d1 = new D();
		System.out.println(d1.obj);
		A a1 = new A();
		System.out.println(a1.i);
	}
}

/*
o/p:
null
0
*/