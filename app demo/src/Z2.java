import java.util.Arrays;
class Z2
{
	static int i = test();

	public static int test() 
	{
		System.out.println("from test");
		main(null);
		System.out.println("------");
		main(new String[]{});//physical  string object or empty object//
		System.out.println("------");
		main(new String[]{"hello", "xyz"});//physical  string object or empty object//
		return 100;
	}
	public static void main(String[] args)
	{
		i += 1;
		System.out.println("main:" +i+ "," + Arrays.toString(args));
	}
}