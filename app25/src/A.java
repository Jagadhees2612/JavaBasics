class A 
{
	private int i;//private members of any class if it allowed to same class..i is usung in thne main method of A..
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		a1.i = 100;
		System.out.println(a1.i);
	}
}
