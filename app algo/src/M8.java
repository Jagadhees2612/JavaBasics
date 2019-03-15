class M8
{
	public static void main(String[] args) 
	{
		print(1);
	}
    public static void print(int i) 
    {
		System.out.println(1);
		if(i==4)
		{
			return;
		}
		
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
