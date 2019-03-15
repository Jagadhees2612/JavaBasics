class  S
{
	public static void main(String[] args) 
	{
		int i =120;
		switch( i )
		{
			case 20 :
				System.out.println("from case 20");
				break;
			default ://it is not mantatory//it is optional 
				System.out.println("from default");
				System.out.println("from default");
				System.out.println("from default");
				System.out.println("from default");
			case 80 :
				System.out.println("from case 50");
				break;
				
			case 100 ://it will continue end of the case//so it must breeak or end switch case// 
				System.out.println("from case 100");
				break;
		}
		System.out.println("end");
	}
}

