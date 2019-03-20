interface A
{
	int i = 10;
} 

class L
{
	public static void main(String[] args)
	{
		System.out.println("main begin");//with the interface name itself..
		System.out.println(A.i);
		System.out.println("main end");
	}
}