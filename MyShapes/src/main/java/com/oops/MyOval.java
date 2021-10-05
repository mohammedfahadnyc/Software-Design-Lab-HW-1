package com.oops;

import javafx.scene.canvas.GraphicsContext;

/**
 * MyOval class with related methods
 */
@SuppressWarnings("restriction")
public class MyOval extends MyShape {

    MyRectangle rectangle = null;
    
    /**
     * Constructor with individual points for top left coordinate, width, height and a color
     */
    public MyOval(double x, double y, double width, double height, MyColor color) {
        this(new MyPoint(x, y), width, height, color);
    }

    /**
     * Constructor with top left coordinate, width, height and a color
     */
    public MyOval(MyPoint point, double width, double height, MyColor color) {
        super(point, color);
        this.rectangle = new MyRectangle(point, width, height, color);
    }
    
    /**
     * Calculates and returns the perimeter of an oval 
     */
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(rectangle.getHeight(), 2) + Math.pow(rectangle.getWidth(), 2)) / 2);
    }

    /**
     * Calculates and returns the area of an oval 
     */
    public double getArea() {
        return Math.PI * (rectangle.getHeight() / 2) * (rectangle.getWidth() / 2);
    }    
    
    /**
     * Returns the X point of center coordinate
     */
    public double getX() {
        return rectangle.getX() + (rectangle.getWidth() / 2);
    }
    
    /**
     * Returns the Y point of center coordinate
     */
    public double getY() {
        return rectangle.getY() + (rectangle.getHeight() / 2);
    }
    
    /**
     * Returns the A point from center coordinate
     */
    public double getA() {
        return rectangle.getWidth()/2;
    }
    
    /**
     * Returns the B point from center coordinate
     */
    public double getB() {
        return rectangle.getHeight()/2;
    }
    
    /**
     * String representation of MyOval 
     */
    @Override
    public String toString() {
        return 
                "["+getClass().getName() +
                " : Coordinates:" + point + 
                "; Color:"+color +  
                "; A:"+getA() + 
                "; B:"+getB() + 
                "; Area:"+getArea() +  
                "; Perimeter:"+getPerimeter() +
                "]";
    }
    
    /**
     * Draws an oval on a canvas
     */
    @Override
    public void draw(GraphicsContext graphicsCtx) {
        
        graphicsCtx.setFill(color.getMyColor());
        graphicsCtx.fillOval((rectangle.getX() - (rectangle.getWidth()/2)) , (rectangle.getY() - (rectangle.getHeight()/2)) , rectangle.getWidth() , rectangle.getHeight());
    }    
}
