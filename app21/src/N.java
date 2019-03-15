class N 
{
	N member;//class mem are static mem...static mem are loading only one time
	public static void main(String[] args) 
	{
		N obj1 = new N();
		obj1.member = new N();
		System.out.println("done");
	}
}
//o/p:  done