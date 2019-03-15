class E
{
	E()
	{
		System.out.println("E()");
	}

	public static void main(String[] args) 
	{
		E e1 = new E();// wheaterever the object is crate
		System.out.println("------");
		E e2 = new E();
		System.out.println("------");
		E e3 = new E();
		System.out.println("------");
		E e4  = e1;
		E e5  = e1;
		E e6  = e2;
	}
}
