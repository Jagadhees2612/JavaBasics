package pack2;
class F
{
	public static void main(String[] args) 
	{
		pack1.A obj = new pack1.A();
		//obj.w = 10;
		obj.x = 10;
		obj.y = 10;
		obj.z = 10;
		System.out.println("Hello World!");
	}
}
/*
o/p:
C:\javaC\jan30\app27\src>javac -d ../classes pack2/F.java
pack2\F.java:8: error: x is not public in A; cannot be accessed from outside pa
kage
                obj.x = 10;
                   ^
pack2\F.java:9: error: y has protected access in A
                obj.y = 10;
                   ^
2 errors
*/
