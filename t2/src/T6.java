class  T6
{
	public static void main(String[] args) 
	{
		int i =0;
		int j= i++ + i + i-- + i + i-- + i++ + i-- + i + i++ + i++ + i-- + i + i++;
		System.out.println(i);
		System.out.println(j);
	}
}
/*
output
1
0
/*