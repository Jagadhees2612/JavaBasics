class  K
{
	public void test()
	{
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		//K jag = new K();
		//jag.test();
		System.out.println("This");// this is available in any every non static member and not in static ,,inside a test method this is available,, but not in main method
	}
}

//o/p: This