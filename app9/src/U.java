class  U
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
				break;
			case 80 :
				System.out.println("from case 50");
				break;
				
			case 100 ://it will continue end of the case//so it must breeak or end switch case// 
				System.out.println("from case 100");
				break;
            default :// maximum one default block using in switch cases//if it is more than one default block,it gets error//
				System.out.println("from other default");
				System.out.println("from other default");
		}
		System.out.println("end");
	}
}
