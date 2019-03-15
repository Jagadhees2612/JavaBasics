class J 
{
	public static void main(String[] args) 
	{
		J obj1 = new J();  //through this around.to wherever obj is same 
		J obj2 = obj1;
		J obj3 = obj2;
		J obj4 = obj3; //1 obj can have any no of ref
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);//same obj can have any no .of ref..
	}
}
