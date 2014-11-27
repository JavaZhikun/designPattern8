package flyweight;

import java.util.HashMap;

public class FlyweightFactory 
{
	public HashMap flyweights = new HashMap();
	
	public FlyweightFactory()
	{
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
	    flyweights.put("Z", new ConcreteFlyweight());
		
	}
	
	public Flyweight getFlyweight(String key)
	{
		return  (Flyweight) flyweights.get(key);
	}

}
