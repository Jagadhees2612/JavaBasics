class N 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=i++ + i++ + i++ + i++ + i + i++ + i++ + i++;
		//    10     11    12    13   14   14    15    16
		System.out.println(i); //17
		System.out.println(j); //105
	}
}
