class I 
{
	I(int x)  //arguement cons only avail in i 
	{
		System.out.println("I(int)");//u need to supply value inthe i
	}
	public static void main(String[] args) 
	{
		I obj1 = new I(77);
		System.out.println("------");
		I obj2 = new I(44);
		System.out.println("------");
	}
}
