class D
{
	D()
	{
		System.out.println("D()");//no matter which constr to  using to create an object then iib execution...iib using...iib executing 1 time for 1 obj execution...
	}

	{
		System.out.println("IIB");
	} 

	D(int i)
	{
		System.out.println("D-IIB");
	}

	public static void main(String[] args) 
	{
		D d1 =new D();
		System.out.println("--------");
		D d2 =new D(20);
		System.out.println("--------");
	}
}
/*
o/p:
IIB
D()
--------  
IIB
D-IIB
--------
*/