package com.lessons;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.lessons.circle.Circle;
import com.lessons.square.Square;
import com.lessons.triangle.Triangle;


public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
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
	
   
    
	}

}
