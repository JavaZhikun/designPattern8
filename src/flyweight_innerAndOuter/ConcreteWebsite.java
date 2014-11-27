package flyweight_innerAndOuter;

public class ConcreteWebsite extends Website
{
	public String name ="";
	
	public ConcreteWebsite(String name)
	{
		this.name = name;
	}
	
	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("ÍøÕ¾·ÖÀà");
	}
	
	

	
}
