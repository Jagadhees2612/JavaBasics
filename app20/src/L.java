class L 
{
	static  int count;
	
	L()
	{
		count ++;
	}

    L(int i)
	{
		count ++;
	}

	L(int i,int j)  //const got ovr loading very properly 
	{
		count ++;
	}

	public static void main(String[] args) 
	{
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L(20);
		L obj4 = new L(120);
		L obj5 = new L(20,0);
		L obj6 = new L(1,20);
		System.out.println(L.count);
	}
}

//o/p:  6
