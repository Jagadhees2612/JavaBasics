class A1 
{
	public static void main(String[] args) 
	{
		int i =10;
		System.out.println(i);
		int i =20;
		System.out.println(i);
	}
}

/*
o/p:
A1.java:7: error: variable i is already defined in method main(String[])
                int i =20;
                    ^
1 error
*/
