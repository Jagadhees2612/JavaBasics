class B 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		short s1 = (short) b1;
		int i = (int) b1;//compiler assigning itself..wider is auto ..this conveertion very optional..
		int j = (int) s1;
		System.out.println("done");
	}
}

///O/P:   done