package com.example.pattern.interpreter;

import java.util.HashMap;

/**
 * 抽象院算符解析器 這裡，每個運算符號，都只和自己左右兩個數字有關係
 * 但左右兩個數字有可能也是一個解析的結果，無論何種類型，都是Expression類的實現類
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//因為 SymbolExpression 是讓其子類來實現 interpreter 是一個默認實現
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
