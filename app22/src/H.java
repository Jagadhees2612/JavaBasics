class G
{
	int x;
	int y;
}
class H extends G   //is-a
{
	void test1()
	{
		System.out.println("From test1:" +x+ "," +y);
	}
	public static void main(String[] args)
	{
		H h1 = new H();
		h1.test1();
		System.out.println("done");
	}
}
/*
o/p:
From test1:0,0
done
*/