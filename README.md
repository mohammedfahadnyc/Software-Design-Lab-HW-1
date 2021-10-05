# Software-Design-Lab-
Software Design Class CSC 22100 For Fall 2021
[Java-JavaFX-Project.docx](https://github.com/mohammedfahadnyc/Software-Design-Lab-HW-1/files/7289204/Java-JavaFX-Project.docx)

Problem

A very popular term in software is Object Oriented Programming (OOP). Most of us have heard about it while learning a language like Java. OOP is a programming paradigm in a software engineering and can provide some very powerful capabilities to programmers. Polymorphism, Inheritance and Encapsulation are the fundamental pillars of OOP.

We are going to gain a practical knowledge of the core concepts of OOP in this project. We will be using Java language to develop our solution. We are going to implement an object oriented solution for creating a following types of Shapes and display all of them.

•	Line - a straight line between two points and has angle and length based on the points.
•	Rectangle - a shape with four sides and four right angles and has an area and a perimeter based on its size.
•	Oval - a smooth looking closed, plane curved shape with no straight side or no angles. It has an area, a perimeter and a minor & a major axis.

In short, we are going to develop a small application, using OOP concept, that will draw aforementioned shapes.
 
Next section describes the details about the implementation.
 
Solution Methods
We'll describe the our approach to the solution. The aim is to draw a shape like Line, Rectangle or Oval. 

If we look at the shapes, we found below common attributes.
1. Each shape has a color.
2. Each shape is consisting of one or more co-ordinates.
2. Each closed shape (like Rectangle, Oval, Circle) can have an area as well as a perimeter.

We also found specific properties. Below are the examples.
1. A line is consisting of 2 co-ordinates.
2. A rectangle is consisting of 4 co-ordinates that will provide us the width as well as height of a rectangle.
3. An oval is curved shape having a single point but the way it structured (like a rectangle) will provide us the width, the height and a abscissa ( a minimum and a maximum distance from a center point).

With the above observations, we started by creating classes representing common thing.

1. MyColor.java:
This is a common property of each shape. Hence we created an enum (MyColor) which will be used to define a color of a specific shape. We defined 8 different colors in a enum (MyColor).

2. MyPoint.java:
A coordinate is another common poperty of each shape. It is consisting of two attributes: X and Y. MyPoint class indicates a co-ordinate in our system. It is consisting of two attributes: X and Y, required constructors and accessor/mutator methods.

3. MyShape.java:
MyShape represents as a base for all the shapes. It is consisting of common attributes of all the shapes. That is 1. a color, 2. a co-ordinate, required constructors as well as getArea() and getPerimeter() methods. Specific shapes (like Rectangle, Oval) extend MyShape class and override getArea() and getPerimeter() methods.

Next is to implement specific shapes like Line, Rectangle and Oval. We started with simplest one, a line.

4. MyLine.java:
A line is consisting of 2 coordinates and has a color. MyLine is extending MyShape, so it inherits all the properties of MyShape (like a color and a co-ordinate). Since line requires another co-ordinate to form a line, we added another coordinate (MyPoint). Line is an open shape, so it doesn't have an area or a perimeter, so it doesnt override getArea() and getPerimeter() method. However, a line has a length as well as an angle, so we added specific methods for a line: getLength() and getAngle(). Thus, MyLine is consisting of all require attributes (some are inherited from MyShape), constructors and other getter/setter methods.

 
Formulas:
Length:  Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1 , 2))
Angle:  Math.toDegrees(Math.atan((Y2 - Y1)/(X2 - X1)))

5. MyRectangle.java:
A rectangle is consisting of 4 coordinates and has a color. MyRectangle is extending MyShape, so it inherits all the properties of MyShape (like a color and a co-ordinate). hence MyRectangle has a co-ordinate and a color already. It now requires 3 coordinates to form a rectangle. So, we added 2 more attributes; width and height. Now we can derive rest of 3 co-ordinates using a single coordinate, a width and a height. As a rectangle is a closed shape, so it has an area or a perimeter, so getArea() and getPerimeter() method are overridden in MyRectangle. Overall, MyRectangle is consisting of all require attributes (some are inherited from MyShape), constructors and other getter/setter methods.

Formulas:
Area:  Height * Width
Perimeter:  2 * (Height * Width)

6. MyOval.java:
An oval is consisting of a single coordinate and has a color. MyOval is extending MyShape, so it inherits all the properties of MyShape (like a color and a co-ordinate). hence it has a co-ordinate and a color already. It now to form an oval shape, it requires 2 more attributes; width and height. Like rectangle, an oval is also a closed shape, so it has an area or a perimeter, so getArea() and getPerimeter() method are overridden in MyOval. However, an oval has 2 more attributes. That is a minimum distance and a maximum distance from the center, so we added specific methods for an oval: getA() and getB(). Now, MyOval is consisting of all require attributes (some are inherited from MyShape), constructors and other getter/setter methods.

Formulas:
Area:  Math.PI * (Height / 2) * (Width / 2)
Perimeter:  2 * Math.PI * Math.sqrt((Math.pow(Height, 2) + Math.pow(Width, 2)) / 2)
A:  Width / 2
B:  Height / 2

Above classes are to represent Shapes in OOP system. We also developed below supporting class to display the results on the screen.

7. MyCanvas.java:
This is an entry point of the application. It is build upon JavaFX framework. It launches the application, prompts user for an input and displays the result on the screen. 
 
Flow Chart:
Below is the flow diagram of an application.

 


Class Diagram:
Below is the class diagram for our application.

 


Technology:
Java - All the classes are built using Java language only.
JavaFX - Alert/ButtonType - component used to prompt user if she/he wants to use default size canvas
JavaFX - ChoiceDialog - component used to prompt user with a dropdown with different sizes for a canvas
JavaFX - GraphicsContext - component used for drawing of shapes like a line, a rectangle or an oval.
![image](https://user-images.githubusercontent.com/54411378/136100041-415387f5-e5ca-4e60-9306-ef37d9534a41.png)



Result (Output)
Use Case 1: User opts to use default canvas size (1000x600).

 

 
 
Use Case 2: User opts to use different canvas size (333x200).

 

 

 

![image](https://user-images.githubusercontent.com/54411378/136100136-cea766cf-e806-4198-908e-04fd80abb389.png)
