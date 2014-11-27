package flyweight_shareWebsiteCode;

import java.util.HashMap;

public class WebsiteFactory 
{
	public HashMap flyweights = new HashMap();
	
	
	//获取网站分类 
	public Website getWebsiteCategory(String key)
	{
		if(!flyweights.containsKey(key))
			flyweights.put(key, new ConcreteWebsite(key));
		
		return (Website)flyweights.get(key);
	}
	
	
	
	
	//获取网站总数
	public int getWebsiteCount()
	{
		return flyweights.size();
	}

}
