package com.example.pattern.prototype.deepclone;

import java.io.Serializable;

/**
 * 原型模式
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String cloneName;

	private String cloneClass;

	//構造器
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	// 因為該類的屬性都是 String , 因此我們這裡使用默認的 clone 完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
