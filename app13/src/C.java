class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.0, 20.6, 30.6, 10.80, 5.80, 60.45};
		for(double element : elements)//before colon variable
		{
			System.out.println(element);
		}
		System.out.println("main end" + element);
	}
}

/*
o/p:
                System.out.println("main end" +element);
                                               ^
  symbol:   variable element
  location: class C
1 error
*/