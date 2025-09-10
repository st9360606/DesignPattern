package com.example.pattern.interpreter;

import java.util.HashMap;

/**
 * 抽象類表達式，通過 HashMap 鍵值對，可以獲取到變量的值
 * 
 * @author Administrator
 *
 */
public abstract class Expression {
	// a + b - c
	// 解釋公式和數值, key 就是公式(表達式) 參數 [a,b,c], value 就是具體值ֵ
	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
