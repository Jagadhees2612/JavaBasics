class O 
{
	public static void main(String[] args) 
	{
		int i=1;
		int j=i++ + i-- + i-- + i + i++ + i++ + i++ +
			i-- + i + i++ + i++ + i + i-- + i++ + i;
		//    1      2     1     0   0     1     2
		//    3    2    2    3     4    4     3    4
		System.out.println(i); // 4
		System.out.println(j); //32
	}
}
