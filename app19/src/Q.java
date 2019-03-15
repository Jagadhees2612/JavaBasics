class Q 
{
	Q()
	{
		this(90);//inteacher arg construc    ...same class inteaCher arg const..
		System.out.println("Q()");
	}
	Q(int i)
	{
		System.out.println("Q(int)");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q(90);
		System.out.println("--------");
		Q q2 =new Q();
	}
}


/*
o//p:
Q(int)
--------
Q(int)
Q()
*/