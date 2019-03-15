class K 
{
	int x;
}
class k
	{
		A obj;


		{
			obj = new A();
		}
	public static void main(String[] args) 
	{
		K ref  = new K();
		System.out.println(ref.obj.x);
		ref.obj.x = 100;
		System.out.println(ref.obj.x);
		ref.obj.x = 200;
		System.out.println(ref.obj.x);
	}
}
