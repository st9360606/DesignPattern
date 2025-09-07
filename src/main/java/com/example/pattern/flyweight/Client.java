package com.example.pattern.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 創建一個工廠類
		WebSiteFactory factory = new WebSiteFactory();

		// 客戶要一個以新聞形式發布的網站
		WebSite webSite1 = factory.getWebSiteCategory("新聞");

		
		webSite1.use(new User("tom"));

        // 客戶要一個以Blog形式發布的網站
		WebSite webSite2 = factory.getWebSiteCategory("Blog");

		webSite2.use(new User("jack"));

        // 客戶要一個以Blog形式發布的網站
		WebSite webSite3 = factory.getWebSiteCategory("Blog");

		webSite3.use(new User("smith"));

        // 客戶要一個以Blog形式發布的網站
		WebSite webSite4 = factory.getWebSiteCategory("Blog");

		webSite4.use(new User("king"));
		
		System.out.println("網站的分類總數共 = " + factory.getWebSiteCount());
	}

}
