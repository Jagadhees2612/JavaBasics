class T 
{
	int i = test(); //indirect 
	int j = 10;
	int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		T t1 = new T();
		System.out.println(t1.i+ "," +t1.j);
	}
}


//o/p:   0,10