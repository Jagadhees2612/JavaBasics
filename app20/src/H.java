class H 
{
	static int count;

	H()
	{
			count ++;
	}

	public static void main(String[] args) 
	{
		H obj1 = new H();//in obj is used for any purpose that shou be avail in the mem..
		H obj2 = new H();
		H obj3 = new H();
		H obj4 = new H();//compiler replacing frm the referance var....
		//System.out.println(obj1.count + "," + obj2.count + "," + obj3.count + "," + obj4.count);
		System.out.println(H.count + "," + H.count + "," + H.count + "," + H.count);
	}
}

//o/p:   4,4,4,4
