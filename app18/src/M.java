class  M
{
	public static void main(String[] args) 
	{
		M object = new M();
		System.out.println("main:" +object);
		System.out.println("main:" +object.i);
		object.test();//through test we get obj
	}
    int i =10;
    void test()
	{
		System.out.println("test:" + this);
		System.out.println("test:" + this.i);
	}
}

/*
o/p:
main:M@15db9742
main:10
test:M@15db9742
test:10
*/