class F 
{
	int i;

	public static void main(String[] args) //whenever object is creating, non static member loading to the memory
	{
		F f1 = new F();///object creating statement ,f class creation by using  a new operator..//f1 is a reference var lhs, rhs is object var
		System.out.println(f.i);
	}
}
//o/p: 0
