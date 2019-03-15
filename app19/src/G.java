class G
{
	int i;
	G(int x)  // we r supplying the vale  rwhile creating a obj valuein constructor..for common 
	{
		i =x;
	}

	public static void main(String[] args) 
	{
		G g1 = new G(90);// wheaterever the object is crate
		System.out.println(g1.i);
		G g2 = new G(910);
		System.out.println(g2.i);
		G g3 = new G(901);
		System.out.println(g3.i);
		G g4 =new  G(500);
		System.out.println(g4.i);
	}
}

/*
o/p:
90
910
901
500
*/