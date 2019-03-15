class B 
{
	public static void main(String[] args) 
	{
		boolean b1=true;
		boolean b2=!true;
		boolean b3=b1;
		boolean b4=!b1;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("-------");
		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println(!b3);
		System.out.println(!b4);
		System.out.println("--------");
	}
}

/*
o/p:
true
false
true
false
-------
false
true
false
true
--------
*/