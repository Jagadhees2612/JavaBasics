class E 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "test";
		String s3 = "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest";
		String s4 = "";
		String s5 = "hello";//there is no boundary line in string value//
		System.out.println(s1.hashCode());//every string hashcode will be under int value//
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}
}
