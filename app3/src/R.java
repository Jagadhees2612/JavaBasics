class R 
{
	public static void main(String[] args) 
	{
		int i=0;
		boolean b1=true&&(i++ ==0);
		System.out.println(b1);
		System.out.println(i);
	}
}

/*
o/p:
true
1
*/