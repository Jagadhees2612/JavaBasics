class A 
{
	int x;
}
class J
{
	A obj;//to wherever a1 pointing to the same obj pointing...
	J(A obj)
	{
		this.obj = obj;//global obj..
	}
	public static void main(String[] args)
	{ 
		J ref = new J(new A()); //there is no local ref variable..whatever obj is creating 
		System.out.println(ref.obj.x);///obj 
		ref.obj.x = 100;
		System.out.println(ref.obj.x);
		ref.obj.x = 200;
		System.out.println(ref.obj.x);
	}
}

/*
o/p:
0
100
100
*/