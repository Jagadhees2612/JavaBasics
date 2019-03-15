class A 
{
	A(int i)
	{
	}
}
class Z extends A
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
o/p:
Z.java:7: error: constructor A in class A cannot be applied to given types;
class Z extends A
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
