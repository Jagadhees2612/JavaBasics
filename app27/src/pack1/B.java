private pack1;
class B 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		
		obj.w = 10;
		obj.x = 10;
		obj.y = 10;
		obj.z = 10;///public usage ..
		System.out.println("done");//deffault alloed in the same pack protected also alloews in the same package
	}
}
//protect mem allowed to throughout the package in throut the pack protect the current mem..