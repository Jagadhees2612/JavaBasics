class A 
{
	int i;
}
class H
{
	A obj = new A();
	int x = 20;
	A obj2 = new A();
	String s1 = "hello";//the rel b/w H n A
	public static void main(String[] args)
	{
		H j = new H();
		System.out.println(j.obj1.x);
		System.out.println(j.x);
		System.out.println(j.obj2.x);
		System.out.println(j.s1);
		j.obj1.x = 200;
		j.obj2.x = 300;
		j.x = 400;
		j.s1 = "test";
		System.out.println(j.obj1.x);
		System.out.println(j.x);
		System.out.println(j.obj2.x);
		System.out.println(j.s1);
	}
}
