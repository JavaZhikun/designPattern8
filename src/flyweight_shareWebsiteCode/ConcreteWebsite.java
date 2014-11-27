package flyweight_shareWebsiteCode;

public class ConcreteWebsite extends Website
{

	public String name ="";
	
	public ConcreteWebsite(String name )
	{
		this.name = name;
	}
	
	public void use()
	{
		System.out.println("ÍøÕ¾·ÖÀà£º" + name );
	}
}
