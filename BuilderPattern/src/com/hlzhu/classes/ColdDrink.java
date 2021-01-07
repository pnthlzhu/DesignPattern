package com.hlzhu.classes;

import com.hlzhu.interfaces.Item;
import com.hlzhu.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String name();

	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
