class E 
{
	{
		System.out.println("E-IIB1");//no matter which constr we are using... iib exec neutral content for every all obj we are use iib can executing..iib can specify  the constructor
	} 
	E()
	{
		System.out.println("E()");
	}
	{
		System.out.println("E-IIB2");
	} 

	E(int i)
	{
		System.out.println("E(int)");
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("========");
		E e2 = new E(90);
	}
}


/*
o/p:
E-IIB1
E-IIB2
E()
========
E-IIB1
E-IIB2
E(int)
*/
