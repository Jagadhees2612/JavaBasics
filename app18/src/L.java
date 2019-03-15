class  L
{
	public void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		L j = new L();
		System.out.println("main:" +j);
		j.test();//whichever this is nothing but obj..obj acting as a ..this is body ofthe test method..
	}
}

/*
o/p:
main:L@15db9742
test:L@15db9742
*/