class A 
{
	int i;
}
class G
{
	A obj = new A();
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.obj.i);
		g1.obj.i = 10;
		System.out.println(g1.obj.i);
		A a1 =new A();
		System.out.println(a1.i);
		a1.i = 20;
		System.out.println(a1.i);

	}
}
