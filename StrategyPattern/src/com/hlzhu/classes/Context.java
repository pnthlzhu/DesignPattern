package com.hlzhu.classes;

import com.hlzhu.interfaces.Strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return this.strategy.doOperation(num1, num2);
	}
}
