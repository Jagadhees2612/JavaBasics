class W 
{
	W()
	{
		System.out.println("W()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W w1 = new W();//whil creating obj is W not only in the constructors in the W..
		System.out.println("main end");
	}
}

/*
o/p:
main begin
W()
main end
*/