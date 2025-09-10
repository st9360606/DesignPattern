package com.example.pattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	// 定義表達式
	private Expression expression;

	// 構造函數傳參，並解析
	public Calculator(String expStr) { // expStr = a+b
		// 安排運算先後順序
		Stack<Expression> stack = new Stack<>();
		// 表達式拆分成字符數組
		char[] charArray = expStr.toCharArray();// [a, +, b]

		Expression left = null;
		Expression right = null;
		//遍歷我們的字符數組，即遍歷  [a, +, b]
		//針對不同的情況，做處理
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': //
				left = stack.pop();// 從 stack 取出 left => a
				right = new VarExpression(String.valueOf(charArray[++i]));// 取出右表達式 "b"
				stack.push(new AddExpression(left, right));// 然後根據得到 left 和 right 構建 AddExpresson 加入 stack
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				//如果是一個 Var 就創建要給 VarExpression 對象 並push 到 stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//當遍歷完整個 charArray 數組後，stack 就得到最後的 Expression
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		//最後將表達是 a+b 和 var = {a=10,b=20}
		//然後傳遞給 expression 的 interpreter 進行解釋執行
		return this.expression.interpreter(var);
	}
}