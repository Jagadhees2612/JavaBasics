class M 
{
	public static void main(String[] args) 
	{
		int i = 130;
		short s1 = (byte) i;//int bcoz of int supposed to getting short cnverting..auto converting short wider..
		System.out.println(s1);
	}
}

//O/P: -126