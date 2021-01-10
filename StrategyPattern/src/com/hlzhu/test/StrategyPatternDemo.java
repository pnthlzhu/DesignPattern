package com.hlzhu.test;

import com.hlzhu.classes.Context;
import com.hlzhu.classes.OperationAdd;
import com.hlzhu.classes.OperationMultiply;
import com.hlzhu.classes.OperationSubtract;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = null;
		
		context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
