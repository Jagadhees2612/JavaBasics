class A 
{
	int i;
}
class F  
{
	A obj = new A();
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.obj.i);
		A a1 = new A();//the relationship b/w f and a is has relation..
		System.out.println(a1.i);
	}
}
/*
o/p:
0
0
*/
