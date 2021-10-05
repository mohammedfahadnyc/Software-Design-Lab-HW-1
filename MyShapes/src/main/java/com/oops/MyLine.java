package com.oops;

import javafx.scene.canvas.GraphicsContext;

/**
 * MyLine class with related methods
 */
@SuppressWarnings({ "restriction" })
public class MyLine extends MyShape {
    
    MyPoint point2;
    
    /**
     * Constructor with individual points for 2 coordinates and a color
     */
    public MyLine(double x1, double y1, double x2, double y2, MyColor color) {
        this(new MyPoint(x1, y1), new MyPoint(x2, y2), color);
    }

    /**
     * Constructor with 2 coordinates and a color
     */
    public MyLine(MyPoint point1,MyPoint point2, MyColor color) {
        super(point1, color);
        this.point2 = point2;
    }

    /**
     * Returns 2nd coordinate of a line 
     */
    public MyPoint getPoint2() {
        return this.point2;
    }
    
    /**
     * Sets 2nd coordinate of a line 
     */
    public void setPoint2(MyPoint point) {
        this.point2 = point;
    }
    
    
    /**
     * String representation of MyLine 
     */
    @Override
    public String toString() {
        return 
                "["+getClass().getName() +
                " : Coordinates:" + point + "," +point2 +
                "; Color:"+color +  
                "; Angle:"+getAngle() + 
                "; Length:"+getLength() +
                "; Area:"+getArea() +  
                "; Perimeter:"+getPerimeter() +
                "]";
    }
    
    
    /**
     * Draws a line on canvas between given coordinates 
     */
    @SuppressWarnings("restriction")
    public void draw(GraphicsContext graphicsCtx) {
        
        graphicsCtx.strokeLine(point.getX() , point.getY() , point2.getX() , point2.getY());
        
        System.out.println("Drawing "+this.toString());
    };
    
    /**
     * Calculates and returns the length of a line 
     */
    public double getLength() {
        return Math.sqrt(Math.pow(point2.getX() - point.getX() , 2) + Math.pow(point2.getY() - point.getY() , 2));
    };
    
    /**
     * Calculates and returns the angle (in degree) of a line 
     */
    public double getAngle() {
        double angle;
        double tantheta = (point2.getY() - point.getY()) / (point2.getX() - point.getX());
        angle = Math.atan(tantheta);
        angle = Math.toDegrees(angle);
        return angle;
    };
}
