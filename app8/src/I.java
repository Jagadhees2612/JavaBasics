class I
{
	public static void main(String[] args) 
	{
		int i=true?(true?1:2):(true?3:4);
		System.out.println(i);
		int j=false?(true?1:2):(true?3:4);
		System.out.println(j);
		int k=true?(false?1:2):(true?3:4);
		System.out.println(k);
		int l=false?(true?1:2):(false?3:4);
		System.out.println(l);
		
	}
}
