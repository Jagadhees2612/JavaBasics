class M12
{
	public static void main(String[] args) 
	{
		print(1);
	}
	public static void print(int i)
	{
		System.out.println(i);
		if(i==5)
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
2
3
4
5
*/