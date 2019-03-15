package pack2;
import pack1.A;
class H extends A 
{
	public static void main(String[] args) //private def public
	{
		H obj = new H();//with respecyt to inh sub cls in the same pack no diff at all with in public n privte..if sub shold be in th sub cla another pack allows to use..no restriction.. 
		//obj.w =10;
		//obj.x =10;
		obj.y =10;.//if prot mem of inh are sub class of same package then can be inth same class...
		obj.z =10;
		System.out.println("Hello World!");
	}
}
