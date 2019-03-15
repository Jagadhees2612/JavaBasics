class O 
{
	public static void main(String[] args) 
	{
		int i=0;
		boolean b1=true||(i++ ==0);//in b1 is taking the true value only..so b1 is 0
		System.out.println(b1);
		System.out.println(i);
	}
}

/*
o/p:
true 
0
*/
