class A2 
{
	public static void main(String[] args) 
	{
		int i=j;
		int j=30;
		System.out.println(i);
		System.out.println(j);
	}
}

/*
o/p:
A2.java:5: error: cannot find symbol
                int i=j;
                      ^
  symbol:   variable j
  location: class A2
1 error
*/
