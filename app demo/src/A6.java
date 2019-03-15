class A6 
{
	public static void main(String[] args) 
	{
		int i=0;
		if((i++ + i++ + --i + ++i==0)&&(i++==4))
		{
		         System.out.println("from if");
		         i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}

/*
o/p:
end of main
2
*/