# Software-Design-Lab-
Software Design Class CSC 22100 For Fall 2021
[Java-JavaFX-Project.docx](https://github.com/mohammedfahadnyc/Software-Design-Lab-HW-1/files/7289204/Java-JavaFX-Project.docx)

Problem

This is a project where we have to create an application in Java to create some specific shapes in a certain order. It comes down to developing some classes that can use other classes created in this program. Using this class hierarchy and the JavaFX graphics, we have to develop a program to draw geometric configuration consisting of a sequence of alternating pattern of oval and their inscribed rectangles, with additional requirements such as the program should run for different canvas sizes and the dimensions should be proportional to the canvas size and filled with different colors that’s predefined in the program.

A very popular term in software development is Object Oriented Programming (OOP). OOP is a programming paradigm in software engineering and can provide some very powerful capabilities to programmers. Polymorphism, Inheritance and Encapsulation are the fundamental pillars of OOP.

This project heavily relies on the OOP paradigm and using java graphics(namely JavaFX) to create beautiful ui based development. We are going to implement an object oriented solution for creating the following types of Shapes and display all of them.

Line - a straight line between two points and has angle and length based on the points.
Rectangle - a shape with four sides and four right angles and has an area and a perimeter based on its size.
Oval - a smooth looking closed, plane curved shape with no straight side or no angles. It has an area, a perimeter and a minor & a major axis.

In short, we are going to develop a small application, using the OOP concept,with the help of the javafx library to create an application that will result in the  aforementioned outcome.
 
Next section describes the details about the implementation.

Solution Methods
We'll describe our approach to the solution. The aim is to draw a shape like Line, Rectangle or Oval. 

If we look at the shapes, we found below common attributes.
1. Each shape has a color.
2. Each shape consists of one or more co-ordinates.
2. Each closed shape (like Rectangle, Oval, Circle) can have an area as well as a perimeter.

We also found specific properties. Below are the examples.
1. A line consists of 2 coordinates.
2. A rectangle consists of 4 coordinates that will provide us the width as well as height of a rectangle.
3. An oval is a curved shape having a single point but the way it is structured (like a rectangle) will provide us the width, the height and an abscissa ( a minimum and a maximum distance from a center point).

With the above observations, we started by creating classes representing common things.

We create a class to represent common properties such as colors, finding x and y coordinates for each lines, a base shape for all different shapes,lines and
calculate angles and length for different geometric shapes and we create some class which extends another class, a few class that create some specific shapes and a class to show all the graphics and all the output with different shapes and colors to print  on a window and print the output of the program after it runs successfully. 
Below is the detailed description of all these things :


1. MyColor.java:
This is a common property of each shape. Hence we created an enum (MyColor) which will be used to define a color of a specific shape. We defined 8 different colors in an enum (MyColor).

2. MyPoint.java:
A coordinate is another common property of each shape. It consists of two attributes: X and Y. MyPoint class indicates a coordinate in our system. It consists of two attributes: X and Y, required constructors and accessor/mutator methods.

3. MyShape.java:
MyShape represents a base for all the shapes. It consists of common attributes of all the shapes. That is 1. a color, 2. a co-ordinate, required constructors as well as getArea() and getPerimeter() methods. Specific shapes (like Rectangle, Oval) extend the MyShape class and override getArea() and getPerimeter() methods.

Next is to implement specific shapes like Line, Rectangle and Oval. We started with the simplest one, a line.

4. MyLine.java:
A line consists of 2 coordinates and has a color. MyLine is extending MyShape, so it inherits all the properties of MyShape (like a color and a co-ordinate). Since a line requires another coordinate to form a line, we added another coordinate (MyPoint). Line is an open shape, so it doesn't have an area or a perimeter, so it doesn't override getArea() and getPerimeter() methods. However, a line has a length as well as an angle, so we added specific methods for a line: getLength() and getAngle(). Thus, MyLine consists of all required attributes (some are inherited from MyShape), constructors and other getter/setter methods.

Formulas:
Length:  Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1 , 2))
Angle:  Math.toDegrees(Math.atan((Y2 - Y1)/(X2 - X1)))

5. MyRectangle.java:
A rectangle consists of 4 coordinates and has a color. MyRectangle is extending MyShape, so it inherits all the properties of MyShape (like a color and a co-ordinate). hence MyRectangle has a coordinate and a color already. It now requires 3 coordinates to form a rectangle. So, we added 2 more attributes; width and height. Now we can derive the rest of 3 coordinates using a single coordinate, a width and a height. As a rectangle is a closed shape, so it has an area or a perimeter, so getArea() and getPerimeter() methods are overridden in MyRectangle. Overall, MyRectangle consists of all required attributes (some are inherited from MyShape), constructors and other getter/setter methods.

Formulas:
Area:  Height * Width
Perimeter:  2 * (Height * Width)

6. MyOval.java:
An oval consists of a single coordinate and has a color. MyOval is extending MyShape, so it inherits all the properties of MyShape (like a color and a co-ordinate). Hence it has a coordinate and a color already. Now to form an oval shape, it requires 2 more attributes; width and height. Like a rectangle, an oval is also a closed shape, so it has an area or a perimeter, so the getArea() and getPerimeter() method are overridden in MyOval. However, an oval has 2 more attributes. That is a minimum distance and a maximum distance from the center, so we added specific methods for an oval: getA() and getB(). Now, MyOval consists of all required attributes (some are inherited from MyShape), constructors and other getter/setter methods.

Formulas:
Area:  Math.PI * (Height / 2) * (Width / 2)
Perimeter:  2 * Math.PI * Math.sqrt((Math.pow(Height, 2) + Math.pow(Width, 2)) / 2)
A:  Width / 2
B:  Height / 2

Above classes are to represent Shapes in the OOP system. We also developed the below supporting class to display the results on the screen.

7. MyCanvas.java:
This is an entry point of the application. It is built upon the JavaFX framework. It launches the application, prompts users for an input and displays the result on the screen. 


Here is a simple flow chart and class diagram for our program : 



Flow Chart:

Below is the flow diagram of the application :




Class Diagram: Below is the class diagram for our application : 



Tools and Technology:
Java -
 All the classes are built using Java language

JavaFX - Alert/ButtonType - 
component used to prompt user if they want to use default size canvas

JavaFX - ChoiceDialog - component used to prompt user with a dropdown with different sizes for a canvas

JavaFX - GraphicsContext - component used for drawing of shapes like a line, a rectangle or an oval.



Result (Output)
Use Case 1: User opts to use default canvas size (1000x600).

 

 
 
Use Case 2: User opts to use different canvas size (333x200).

 

 

 

![image](https://user-images.githubusercontent.com/54411378/136100136-cea766cf-e806-4198-908e-04fd80abb389.png)
