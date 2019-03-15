class  A
{
	static int i;
}
class B
{
	public static void main(String[] args) 
	{
		//System.out.println(i); it is not a part of main metod and i is not in B class..so error comes
		System.out.println(A.i); //we should refer A.i
	}
}

//o/p:  0