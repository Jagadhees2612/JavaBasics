class A 
{
	A()
	{//for1 obj creation whatever  1 tym only not multiple tyms 
		//super();//if it is executind multiple times..if same tif itym of initialin is
		System.out.println("A()");
	}
}
class J extends A
{
	J()
	{
		System.out.println("J()");
		super();
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("Hello World!");
	}
}
/*
o/p:
J.java:13: error: call to super must be first statement in constructor
                super();
                     ^
1 error
*/
