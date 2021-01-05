package com.hlzhu.test;

import com.hlzhu.classes.ShapeFactory;
import com.hlzhu.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = null;
		
		//��ȡ Circle �Ķ��󣬲��������� draw ����
		shape = shapeFactory.getShape("CIRCLE");
		//���� Circle �� draw ����
		shape.draw();
		
		//��ȡ Rectangle �Ķ��󣬲��������� draw ����
		shape = shapeFactory.getShape("RECTANGLE");
		//���� Rectangle �� draw ����
		shape.draw();
		
		//��ȡ Square �Ķ��󣬲��������� draw ����
		shape = shapeFactory.getShape("SQUARE");
		//���� Square �� draw ����
		shape.draw();
	}

}
