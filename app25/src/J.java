class I 
{
	private I()//spr clas is private...
	{
	}
}//every stement should be syntactically crct...
class J extends I
{
	public static void main(String[] args) //in   the body of j class cons is spr calling... calling statement to super class construc
	{
		System.out.println("Hello World!");
	}
}

/*
o/p:
J.java:7: error: I() has private access in I
class J extends I
^
1 error
*/