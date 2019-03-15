class  N
{
	int i;
	void test()
	{
		System.out.println("test:" +i);  //s.o.p("test:" + this.i);
		i = 30; // this.i =30;//this is nothing but obj
	}
	public static void main(String[] args) 
	{
		N obj = new N();
		System.out.println("main:" + obj.i);
		N m = new N ();
		m.test();
		System.out.println("main:" + m.i);//you will be getting 30
	}
}

/*
o/p:
main:0
test:0
main:30
*/