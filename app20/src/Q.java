class Q 
{
	int i =10;
	int j =20;
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		System.out.println(q1.i + "," + q1.j);
		q1.i =30;
		q1.j =40;
		System.out.println(q1.i + "," + q1.j);
	}
}
/*
o/p:
10,20
30,40
*/