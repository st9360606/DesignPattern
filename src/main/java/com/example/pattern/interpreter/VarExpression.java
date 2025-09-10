package com.example.pattern.interpreter;

import java.util.HashMap;


/**
 * 變量的解釋器
 * @author Administrator
 *
 */
public class VarExpression extends Expression {

	private String key; // key=a,key=b,key=c

	public VarExpression(String key) {
		this.key = key;
	}

	// var 就是 {a=10, b=20}
	// interpreter 根據 變量名稱，返回對應的值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
