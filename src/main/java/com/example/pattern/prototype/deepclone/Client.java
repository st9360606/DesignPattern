package com.example.pattern.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DeepProtoType p = new DeepProtoType();
		p.name = "呂布";
		p.deepCloneableTarget = new DeepCloneableTarget("趙雲", "子龍");
		
		// 方式1 - 完成深拷貝
		
//		DeepProtoType p2 = (DeepProtoType) p.clone();
//
//		System.out.println("p.name=" + p.name + "  p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name=" + p.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	
		// 方式2 - 完成深拷貝 (通過對象的序列化實現 - 推薦使用)
		DeepProtoType p2 = (DeepProtoType) p.deepClone();

		System.out.println("p.name=" + p.name + "  p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + " p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

	}

}
