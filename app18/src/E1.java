class A 
{
	int i;
}
class E  //objn is non static mem of d...if it is a non static use ref var.. d has A 
{
	A obj;
	public static void main(String[] args) 
	{
		//System.out.println("obj");
		E e1 = new E();
		System.out.println(e1.obj.i);
		A a1 = new A();
		System.out.println(a1.i);
	}
}
