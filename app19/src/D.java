class D 
{
    int i;

	D()
	{
		i = 10;//this.i = 10..//this is availab;e to constr body 
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
	}
}

//o/p:10
