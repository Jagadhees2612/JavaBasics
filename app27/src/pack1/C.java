package pack1;
class C extends A
{
	public static void main(String[] args) 
	{
		C obj = new C();
		//obj.w = 10;//u can use public anyway..
		obj.x = 10;//c is a sub class to from the same package pack1..so x is no avil..
		obj.y = 10;//protect mem is inheri to every sub class and it is a common way of default....
		//obj.z = 10;def mem osf sub class is same inheri...
		System.out.println("done");//inhert to use any way
	}
}
/*
o/p:
C:\javaC\jan30\app27\src>javac -d ../classes pack1/C.java
pack1\C.java:7: error: w has private access in A
                obj.w = 10;
                   ^
pack1\C.java:10: error: cannot find symbol
                obj.z = 10;
                   ^
  symbol:   variable z
  location: variable obj of type C
2 errors
*/
