class H
{
	int x;
	H(int x)  // we r supplying the vale  rwhile creating a obj valuein constructor..for common 
	{
		//x =x
		this.x =x;
	}

	public static void main(String[] args) 
	{
		H h1 = new H(90);// wheaterever the object is crate
		System.out.println(h1.x);
		H h2= new H(94);// wheaterever the object is crate
		System.out.println(h2.x);
		H h3 = new H(40);// wheaterever the object is crate
		System.out.println(h3.x);
	}
}

/*
o/p:
90
94
40
*/