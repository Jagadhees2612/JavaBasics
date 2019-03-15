class A 
{
	int x;
}
class I
{
	A obj;//to wherever a1 pointing to the same obj pointing...
	I(A obj)
	{
		this.obj = obj;//global obj..
	}
	public static void main(String[] args)
	{
		A a1 = new A(); 
		I ref = new I(a1); 
		System.out.println(a1.x);
		System.out.println(ref.obj.x);
		a1.x = 100;
		System.out.println(a1.x);
		System.out.println(ref.obj.x);
		ref.obj.x = 200;
		System.out.println(a1.x);
		System.out.println(ref.obj.x);
	}
}
/*
o/p:
0
0
100
100
200
200
*/