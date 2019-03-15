class Q
{
	int x;
	int y;
}
class R
{
	Q obj;
	void test1()
	{
		System.out.println("from test1:" + obj.x + "," + obj.y);
	}
	public static void main(String[] args) 
	{
		R ref = new R();
		ref.obj = new Q();
		ref.test1();
		System.out.println("done");
	}
}

/*
o/p:
from test1:0,0
done
expilicity*/