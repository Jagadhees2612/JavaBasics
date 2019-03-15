class B3 
{
	public static void main(String[] args) 
	{
		boolean[] x = {false, true, false};
		for(int i:x)
		{
		       System.out.println(i);
		}
	}
}

/*
o/p:
B3.java:6: error: incompatible types: boolean cannot be converted to int
                for(int i:x)
                          ^
*/
