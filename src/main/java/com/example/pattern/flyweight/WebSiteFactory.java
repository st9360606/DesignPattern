package com.example.pattern.flyweight;

import java.util.HashMap;

// 網站工廠類，根據需求返回一個網站
public class WebSiteFactory {

	
	//集合，充當池的作用
	private HashMap<String, ConcreteWebSite> pool = new HashMap<>();
	
	//根據網站的類型，返回一個網站，如果沒有就創建一個網站，並放入到池中，並返回
	public WebSite getWebSiteCategory(String type) {
		if(!pool.containsKey(type)) { //判斷池中是否有該類型網站
			//如果沒有就創建，並放入到池中
			pool.put(type, new ConcreteWebSite(type));
		}
		
		return (WebSite)pool.get(type);
	}
	
	//獲取網站分類的總數(池中有多少個網站類型)
	public int getWebSiteCount() {
		return pool.size();
	}
}
