
class B
{
	B() //cons should not have return type for every obj has created //constr is a non static defination block thid is available,,inside a constr body we can use this
	{
		System.out.println("B():" + this);
	}
	public static void main(String[] args) 
	{
		B b1 = new B();//construc should not have a written type...methods should a have a  written type
		System.out.println("main1:" +b1);
		B b2 = new B();//for every obj was creatred constructed has to execute..
		System.out.println("main2:" +b2);
	}
}
/*
o/p:
B():B@15db9742
main1:B@15db9742
B():B@6d06d69c
main2:B@6d06d69c
*/