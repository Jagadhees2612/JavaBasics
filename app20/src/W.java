class  W
{
	W()
	{
		System.out.println("W():"  +i);
	}

	{
		W w1 = new W(); //i is along with class name so it is indirect
		System.out.println("IIB:" + w1.i);//direct was not allowed before notifying jvm...
	}

	int i;

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//o/p:   done
