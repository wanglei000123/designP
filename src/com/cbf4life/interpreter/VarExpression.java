package com.cbf4life.interpreter;

import java.util.HashMap;

public class VarExpression extends Expression {

	private String key;

	public VarExpression(String _key) {

		this.key = _key;

	}

	// 从map中取之

	public int interpreter(HashMap<String, Integer> var) {

		return var.get(this.key);

	}

}
