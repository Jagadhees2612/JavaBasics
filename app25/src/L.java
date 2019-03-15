class K 
{
	private int i;//private mem are not involved or surviving  in the inheritance...not inheriting in the sub class....
}
class L extends K
{
	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println(obj.i);
	}
}
/*
o/p:
L.java:10: error: i has private access in K
                System.out.println(obj.i);
                                      ^
1 error
*/

