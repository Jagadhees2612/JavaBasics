class M7
{
	public static void main(String[] args) 
	{
		print(1);
	}
    public static void print(int i) 
    {
		if(i==5)
		{
			return;
		}
		System.out.println(1);
	    i++;
		print(i);
	}
}

/*
o/p:
1
1
1
1
*/