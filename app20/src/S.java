class S 
{
	int i = j; //by the time of j is not...
	int j = 20;
	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println(s1.i + "," + s1.j);
	}
}

/*
o/p:
S.java:3: error: illegal forward reference
        int i = j;
                ^
1 error
*/