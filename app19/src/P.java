class P
{
	P()
	{
		System.out.println("P()");
	}
	P(int i)
	{
		this();  //it is calling as the this calling the state ment we can call to another constructor of the same class..same class another cons..
		System.out.println("P(int)");//no arg cons as ath same clas.. same class no arg constr..
	}

	public static void main(String[] args) 
	{
		P p2 = new P();
		System.out.println("-------");//while creating a 2nd obj then it is no arg const..so both the cons is executed..
		P p3 = new P(20);
		System.out.println("-------");
	}
}

/*
o/p:
P()
-------
P()
P(int)
-------
*/
