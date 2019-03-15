class G 
{
	private G();// private constructure cant be access from the outside class..  
	{
	}
}
class H
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("Hello World!");
	}
}

//errors..