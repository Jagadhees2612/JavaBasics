package pack2;
import pack1.A;//def scoped mem cant used in outside the current package...def allowed to use within the same packages..def scoped cant be use inh to sub class..
class I extends A
{
	public static void main(String[] args) 
	{
		I obj = new I();/with in the current claSS 
		obj.i = 10;
		obj.test();
		System.out.println("done");
	}
}
/*
o/p:

C:\javaC\jan30\app26\src>javac -d ../classes pack2/I.java
pack2\I.java:7: error: illegal start of expression
                I obj = new I();/with in the current claSS
                                ^
pack2\I.java:7: error: ';' expected
                I obj = new I();/with in the current claSS
                                     ^
pack2\I.java:7: error: ';' expected
                I obj = new I();/with in the current claSS
                                            ^
pack2\I.java:7: error: ';' expected
                I obj = new I();/with in the current claSS
                                                          ^
4 errors
*/