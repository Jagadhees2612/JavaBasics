class M
{
	M()
	{
		System.out.println("M()");totaly 
	}
	M(int i)
	{
		System.out.println("M(int)");//designing mul cons in same class nothing but const overloadig....in 1 clas u can define any no of constr..same class can have develop..con overloading
	}
	public static void main(String[] args) //we should have changes in any no of arg in cons or data type of the arg
	{
		M m1 =new M();
		System.out.println("-------!");
		M m2 =new M(20); //for (1obj creatuion only one cons in data cons //for one obj creation ; ; )
		{
		}
		System.out.println("-------!");
		M m3 =new M(120);
		System.out.println("-------!");
		M m4 =new M();again only 1st constr
		System.out.println("-------!");
	}
}

/*
o/p:
M()
-------!
M(int)
-------!
M(int)
-------!
M()
-------!
*/
