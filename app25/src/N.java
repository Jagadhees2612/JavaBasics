class M 
{
	private void test()
	{
	}
}
class N extends M
{
	public static void main(String[] args) 
	{
		M m1 = new M();//usage whewre u have to use...2.inheritance with respect to current class no inheritance..usaeg within the current class..iH is not invol in the inherutance
		m1.test();
		System.out.println("Hello World!");
	}
}
/*
o/p:
N.java:12: error: test() has private access in M
                m1.test();
                  ^
1 error
*/
