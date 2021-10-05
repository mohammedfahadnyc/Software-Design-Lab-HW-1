package com.oops;

import javafx.scene.canvas.GraphicsContext;

/**
 * MyRectangle class with related methods
 */
@SuppressWarnings("restriction")
public class MyRectangle extends MyShape {

    double height;
    double width;
    
    /**
     * Constructor with individual points for top left coordinate, width, height and a color
     */
    public MyRectangle(double x, double y, double width, double height, MyColor color) {
        this(new MyPoint(x, y), width, height, color);
    }

    /**
     * Constructor with top left coordinate, width, height and a color
     */
    public MyRectangle(MyPoint point, double width, double height, MyColor color) {
        super(point, color);
        this.height = height;
        this.width = width;
    }
    
    /**
     * Returns the X point of top left coordinate
     */
    public double getX() {
        return point.getX();
    }
    
    /**
     * Sets the X point of top left coordinate
     */
    public void setX(double x) {
        point.setX(x);
    }
    
    /**
     * Returns the Y point of top left coordinate
     */
    public double getY() {
        return point.getY();
    }
    
    /**
     * Sets the Y point of top left coordinate
     */
    public void setY(double y) {
        point.setY(y);
    }
    
    /**
     * Returns the height of the rectangle
     */
    public double getHeight() {
        return this.height;
    }
    
    /**
     * Sets the height of the rectangle
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Returns the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }
    
    /**
     * Sets the width of the rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    /**
     * String representation of MyRectangle 
     */
    @Override
    public String toString() {
        return 
                "["+getClass().getName() +
                " : Coordinates:" + point + 
                "; Color:"+color +  
                "; Height:"+getHeight() + 
                "; Width:"+getWidth() +
                "; Area:"+getArea() +  
                "; Perimeter:"+getPerimeter() +
                "]";
    }
    
    /**
     * Draws a rectangle on a canvas
     */
    @SuppressWarnings("restriction")
    public void draw(GraphicsContext graphicsCtx) {
        graphicsCtx.setFill(color.getMyColor());
        graphicsCtx.fillRect(
                (point.getX() - (this.getWidth()/2)) , 
                (point.getY() - (this.getHeight()/2)) , 
                this.getWidth() , this.getHeight());
        System.out.println("Drawing "+this.toString());

    };
    
    /**
     * Calculates and returns the area of a rectangle 
     */
    @Override
    public double getArea() {
        return this.height * this.width;
    };
    
    /**
     * Calculates and returns the perimeter of a rectangle 
     */
    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);
    };    
}
