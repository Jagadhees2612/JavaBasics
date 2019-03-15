class N 
{
	N(int i)
	{
		System.out.println("N(int)");//data type of arg is chnging..int n strin
	}
	N(String i)
	{
		System.out.println("N(String)");//class can have any no of cons onlu one cons have select...it is called as a construc signature..as long as we can over load a constr any no of time
	}
	public static void main(String[] args) 
	{
		N n1 = new N(90);
		System.out.println("-------");
		N n2 = new N("hello");
		System.out.println("-------");
	}
}

/*
o/p:
N(int)
-------
N(String)
-------
*/