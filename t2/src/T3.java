class T3 
{
	public static void main(String[] args) 
	{
		int i;
		int j=i;
		System.out.println("done");
	}
}
/*
output:
T3.java:6: error: variable i might not have been initialized
                int j=i;
                      ^
1 error
*/
