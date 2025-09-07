package com.example.pattern.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//從大到小創建對象
		OrganizationComponent university = new University("台灣大學", " 第一志願 ");
		
		//創建學院
		OrganizationComponent computerCollege = new College("電機學院", " 電機學院 ");
		OrganizationComponent infoEngineercollege = new College("資訊工程學院", " 資訊工程學院 ");
		
		
		//創建各個學院下的系 (隨便舉例)
		computerCollege.add(new Department("半導體", " This is desc "));
		computerCollege.add(new Department("IC設計", " This is desc "));
		computerCollege.add(new Department("算法運算", " This is desc "));
		
		//
		infoEngineercollege.add(new Department("軟體設計", " This is desc "));
		infoEngineercollege.add(new Department("軟體分析", " This is desc "));
		
		//將學院加入到 學校
		university.add(computerCollege);
		university.add(infoEngineercollege);
		
		//university.print();
		infoEngineercollege.print();
	}

}
