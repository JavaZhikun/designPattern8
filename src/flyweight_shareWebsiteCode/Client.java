package flyweight_shareWebsiteCode;

public class Client {
	public static void main(String[] args) {
		WebsiteFactory f = new WebsiteFactory();
		
		Website fx = f.getWebsiteCategory("产品展示");
		Website fy = f.getWebsiteCategory("产品展示");
		Website Fz = f.getWebsiteCategory("产品展示");
		
		
		Website f1 = f.getWebsiteCategory("博客");
		f1.use();
		
		Website f2 = f.getWebsiteCategory("博客");
		f2.use();
		
		Website f3 = f.getWebsiteCategory("博客");
		f3.use();
		
		System.out.println("网站分类总数为：" + f.getWebsiteCount());
		
		
	}

}
