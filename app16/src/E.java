class E 
{
	static int i =j;
	static int j =10;
	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
}

/*
o/p:
E.java:3: error: illegal forward reference
        static int i =j;
                      ^
1 error
*/