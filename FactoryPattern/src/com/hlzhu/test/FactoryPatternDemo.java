package com.hlzhu.test;

import com.hlzhu.classes.ShapeFactory;
import com.hlzhu.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = null;
		
		//获取 Circle 的对象，并调用它的 draw 方法
		shape = shapeFactory.getShape("CIRCLE");
		//调用 Circle 的 draw 方法
		shape.draw();
		
		//获取 Rectangle 的对象，并调用它的 draw 方法
		shape = shapeFactory.getShape("RECTANGLE");
		//调用 Rectangle 的 draw 方法
		shape.draw();
		
		//获取 Square 的对象，并调用它的 draw 方法
		shape = shapeFactory.getShape("SQUARE");
		//调用 Square 的 draw 方法
		shape.draw();
	}

}
