class G 
{
	int count;

	G()
	{
		count ++;   //count is a non static member..
	}

	public static void main(String[] args) 
	{
		G obj1 = new G();
		G obj2 = new G();
		G obj3 = new G();
		G obj4 = new G();
		System.out.println(obj1.count + "," + obj2.count + "," + obj3.count + "," + obj4.count);
	}
}

//o/p:  1,1,1,1