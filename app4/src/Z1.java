class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		if(i++==11 && i++==11)
		{
		System.out.println("if -block -start1:"+i);
		System.out.println("if -block -start2:"+i++);
		i++;
		
		}
        System.out.println("main end: "+i);
	}
}
