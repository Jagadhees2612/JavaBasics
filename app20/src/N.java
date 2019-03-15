class N
{
	static  int count;
	
	N()
	{
		this(60);
	}

    N(int i)
	{
		this(1, 60);
	}//no matter for how many cons are executing..for 1 obj executes 

	N(int i,int j)   
	{
	}

	{
		count ++;
	}

	public static void main(String[] args) 
	{
		N obj1 = new N();
		N obj2 = new N();
		N obj3 = new N(20);
		N obj4 = new N(120);
		N obj5 = new N(20, 0);
		N obj6 = new N(1, 20);
		System.out.println(N.count);
	}
}

//o/p:  6