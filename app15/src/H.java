class H 
{
	static byte p;
	static short q;
	static int r;
	static long s;
	static float t;
	static double u;
	static boolean v;
	static char o;
	static int[] x;
	static String y;
	static String[] z;
	public static void main(String[] args) 
	{
		System.out.println("byte:"+p);
		System.out.println("short:"+q);
		System.out.println("int:"+r);
		System.out.println("long:"+s);
		System.out.println("float:"+t);
		System.out.println("double:"+u);
		System.out.println("boolean:"+v);
		System.out.println("char:"+o);    //   \u0000
		System.out.println("int []:"+x);
		System.out.println("String:"+y);
		System.out.println("String[]:"+z);
	}
}

/*
o/p:
byte:0
short:0
int:0
long:0
float:0.0
double:0.0
boolean:false
char:
int []:null
String:null
String[]:null
*/