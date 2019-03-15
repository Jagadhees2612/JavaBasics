//58.find out immediate next 5 multiple of a given given number
class B
{
	public static void main(String[] args) 
	{
		if(args.length < 1 )
		{
			System.out.println("pls supply 3 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = i;
		while( j % 5 !=0)
		{
			j++;
		}
		System.out.println("immediate num is:" +i+":"+j);
	}
}
