class L 
{
	L(int i)
	{
		System.out.println("L(int)");//we alreadty provide cons 
	}
	public static void main(String[] args) 
	{
		L obj1 = new L();//no arg cons is not avail...if there is a class without any const then only will be gener no arg..
		System.out.println("------");//if class is does nt have any construc then compiler will generating no arg..
		L obj2 = new L(20);
		System.out.println("------");
	}
}
