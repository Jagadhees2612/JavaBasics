//// byte < short < int < long < float < double 
class A
{
	public static void main(String[] args) 
	{
		byte b1 = 10;
		short s1 = b1;
		int i = b1; //int i = (int) b1);//assigning rhs to lhs...
		int j = s1; //int j = (int) s1);//byte storinhg in int value...compiler only conver in the class file..s1 = short..short into int..automatically convert..
		System.out.println("done");
	}
}
