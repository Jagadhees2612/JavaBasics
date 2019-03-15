package pack1;
class C extends A
{
	public static void main(String[] args) //then shold be public..
	{
		C c1 = new C();//default scoped mem allowed to use inheri also to the sme pack,
		System.out.println(c1.i);//default scoped mem are in same packeges with A,B,C  class also in same... 
		c1.test();
	}
}

//o/p:   0