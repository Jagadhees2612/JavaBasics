class S 
{
	S(int i)
	{
		this(90);//by using this... where int arg in the s class ...int arg is not in the s class..
		System.out.println("S()");//ther is no while developing this caliing sta that is that anothher constr is not avail,, u will be getting com[poile time error..
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//error..