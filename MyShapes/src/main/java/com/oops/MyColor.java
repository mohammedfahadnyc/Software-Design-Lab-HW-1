package com.oops;

import javafx.scene.paint.Color;

/**
 * Enum for different colors
 */
@SuppressWarnings("restriction")
public enum MyColor{
    WHITE(255, 255, 255), 
    ORANGE(255, 255, 0), 
    CYAN(0, 255, 255), 
    MAGENTA(255, 0, 255), 
    RED(255, 0, 0), 
    GREEN(0, 255, 0), 
    BLUE(0, 0, 255), 
    BLACK(0, 0, 0) 
    ;

    private Color color;

    /**
     * Enum constructor accepts R, G, B
     */
    MyColor(int r, int g, int b) {
        this.color = Color.rgb (r,g,b);
    }
    
    /**
     * Returns a color
     */
    public Color getMyColor() { 
        return color; 
    }
    
    /**
     * Returns name of the color
     */
    @Override
    public String toString() {
        return this.name();
    }
}