package com.lessons.triangle;

import com.lessons.AbstractShape;

public class Triangle extends AbstractShape{

	private int sideA;
	private int hight;
	
	
	
	public int getSideA() {
		return sideA;
	}



	public void setSideA(int sideA) {
		this.sideA = sideA;
	}



	public int getHight() {
		return hight;
	}



	public void setHight(int hight) {
		this.hight = hight;
	}



	@Override
	public int getArea() {
	
		return ((sideA/2)* hight);
				
	}

}
