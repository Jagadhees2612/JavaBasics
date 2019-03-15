class Y 
{
	Y()
	{
		Y y1 = new Y(); //cyclic
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//o/p:  done