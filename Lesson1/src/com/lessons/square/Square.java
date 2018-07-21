package com.lessons.square;

import com.lessons.AbstractShape;

public class Square extends AbstractShape{

	private int side;
	
	
	
	public int getSide() {
		return side;
	}



	public void setSide(int side) {
		this.side = side;
	}



	@Override
	public int getArea() {
		return (side * side);
	}

}
