/*class R 
{
	public static void main(String[] args) 
	{
		System.out.println(Q);
	}
}
*/
/*
o/p:
R.java:5: error: cannot find symbol
                System.out.println(Q);
                                   ^
  symbol:   variable Q
  location: class R
1 error
*/
class R 
{
	public static void main(String[] args) 
	{
		System.out.println(Q.i); //if class  is non public then u can save file in any name..
	}
}

/*o/p:
R.java:22: error: cannot find symbol
                System.out.println(Q.i);
                                   ^
  symbol:   variable Q
  location: class R
1 error
*/


/*
compile the the R class like this..

C:\javaC\jan30\app16\src>javac -d ../classes R.java ABC.java

C:\javaC\jan30\app16\src>java -cp ../classes R ABC
0
*/