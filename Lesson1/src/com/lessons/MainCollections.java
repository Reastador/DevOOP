package com.lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.lessons.circle.Circle;
import com.lessons.square.Square;
import com.lessons.triangle.Triangle;


public class MainCollections {
	private static Logger logger = Logger.getLogger(Main.class.getName());
    static List <Shape> list = new ArrayList<Shape>();
	public static void main(String[] args) {
    Circle circle1 = new Circle();
    circle1.setRadius(20);
    Circle circle2 = new Circle();
    circle2.setRadius(30);
    
    logger.log(Level.INFO, "Circle radius is "+ circle1.getRadius() + " Circle area is " + circle1.getArea());
    logger.info("Circle radius is "+ circle1.getRadius() + " Circle area is " + circle1.getArea());
    logger.log(Level.INFO, "Circle radius is "+ circle2.getRadius() + " Circle area is " + circle2.getArea());
    logger.info("Circle radius is "+ circle2.getRadius() + " Circle area is " + circle2.getArea());
    
    Square square1 = new Square();
    square1.setSide(20);
    Square square2 = new Square();
    square2.setSide(2);
    
    logger.log(Level.INFO, "Square side is "+ square1.getSide() + " Square area is " + square1.getArea());
    logger.info("Square side is "+ square1.getSide() + " Square area is " + square1.getArea());
    logger.log(Level.INFO, "Square side is "+ square2.getSide() + " Square area is " + square2.getArea());
    logger.info("Square side is "+ square2.getSide() + " Square area is " + square2.getArea());
    
    Triangle triangle1 = new Triangle();
    triangle1.setHight(6);
    triangle1.setSideA(12);
    
    logger.log(Level.INFO, "Triangle side a is "+ triangle1.getSideA()+ " Triangle hight is "+ triangle1.getHight() + " triangle area is " + triangle1.getArea());
    logger.info("Triangle side a is "+ triangle1.getSideA()+ " Triangle hight is "+ triangle1.getHight() + " triangle area is " + triangle1.getArea());
	
    list.add(circle1);
    list.add(triangle1);
    list.add(square1);
    list.add(square2);
    list.add(circle2);
    //Collections.sort(list, (o1,o2)-> o2.getArea() - o1.getArea());
    
    /*int maxValue = list.get(0).getArea();
    int minValue = list.get(0).getArea();
    
    for(int i = 0;i < list.size();i ++) {	
    maxValue = Math.max(maxValue,list.get(i).getArea());
    }
    
    for(int i = 0;i < list.size();i ++) {
    minValue = Math.min(minValue,list.get(i).getArea());
    }*/
    Shape maxValue = null;
    Shape minValue = null;
    if(list.size()!=0) {
    	maxValue = list.get(0);
    	minValue = list.get(0);
    }
    
    for(int i = 0 ; i < list.size();i ++) {
    	if(maxValue.getArea() < list.get(i).getArea()) {
    		maxValue =  list.get(i);
    	}
    }
    for(int i = 0 ; i < list.size();i ++) {
    	if(minValue.getArea() > list.get(i).getArea()) {
    		minValue =  list.get(i);
    	}
    }
    
    logger.log(Level.INFO, "max area in shape list is "+ maxValue.getArea() 
    + " shape name is "+ maxValue.getClass().getSimpleName());
    
    logger.log(Level.INFO, "min area in shape list is "+ minValue.getArea() 
    + " shape name is " + minValue.getClass().getSimpleName());
    
    // and that is variant with Collections.sort
    Collections.sort(list, (o1,o2)-> o1.getArea() - o2.getArea());
    Shape maxValue2 = list.get(list.size()-1);
    Shape minValue2 = list.get(0);
    logger.log(Level.INFO, "max area in shape list is "+ maxValue2.getArea() 
    + " shape name is "+ maxValue2.getClass().getSimpleName());
    
    logger.log(Level.INFO, "min area in shape list is "+ minValue2.getArea() 
    + " shape name is " + minValue2.getClass().getSimpleName());
	}

}
