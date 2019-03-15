class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] elements = {10, 20, 30, 100, 50, 60};
		for(int element : elements)//before colon variable
		{
			System.out.println(elements);
		}
		System.out.println("main end");
	}
}

/*
o/p:
main begin
[I@1db9742
[I@1db9742
[I@1db9742
[I@1db9742
[I@1db9742
[I@1db9742
main end
*/