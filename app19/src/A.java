class A 
{
	A()
	{
		System.out.println("A()");
		
	}

	public static void main(String[] args) 
	{
		A a1 = new A();//construc should not have a written type...methods should a have a  written type
		System.out.println("-----");
		A a2 = new A ();//for every obj was creatred constructed has to execute..
	}
}
