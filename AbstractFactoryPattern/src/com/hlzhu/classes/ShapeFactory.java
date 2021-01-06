package com.hlzhu.classes;

import com.hlzhu.interfaces.AbstractFactory;
import com.hlzhu.interfaces.Color;
import com.hlzhu.interfaces.Shape;

/**
 * @author zhu_huiling.pfu
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape == null){
			return null;
		}        
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}

}
