class C 
{
	C()
	{
		System.out.println("C()");
	}

	{
		System.out.println("IIB");//instance intialaiztion block ....iib will be executing for every obj creation....
	} //for every obj iib and constr both are executing..we can use iib initialize something...


	public static void main(String[] args) 
	{
		C c1 =new C();
		System.out.println("--------");
		C c2 =new C();
		System.out.println("--------");
	}
}

/*
o//p:
IIB
C()
--------
IIB
C()
--------
*/