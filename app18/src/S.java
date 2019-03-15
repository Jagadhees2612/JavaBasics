class  S
{
	int i;

	public static S test() //void, primitive, derived data type ..we r using is derived data type
	{
		S re = new S();//only 1 obj is create
		System.out.println(re.i);
		re.i =200;
		System.out.println(re.i);
		return re;//whereevr ref is pointing..
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		 S jag = test();
	    System.out.println("main end:" +jag.i);
	}
}

/*
o/p:
main begin
0
200
main end:200
*/