package pack2;
import pack1.A;//def scoped mem cant used in outside the current package...def allowed to use within the same packages..
class H
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;//only in inherita pack it shold be allowed defauklt..
		a1.test();
		System.out.println("done");
	}
}
/*
o/p:
C:\javaC\jan30\app26\src>javac -d ../classes pack2/H.java
pack2\H.java:8: error: i is not public in A; cannot be accessed from outside pa
kage
                a1.i = 10;
                  ^
pack2\H.java:9: error: test() is not public in A; cannot be accessed from outsi
e package
                a1.test();
                  ^
2 errors
*/