#meta info

#author: Arash Vasheghani
#date: May 6, 2024
#version: 1
# Is this a part of another program? No

#Pseudocode
#fully implement Circle, Square and Rectangle class with Shape as the parent class
#implement area of circle, square, and rectangle
#create objects, calling all three child classes from the shape parent class

#implement menu functions and inputs if you have time

# Parent class
class Shape:
    # Method
    def draw(self):
        print("Drawing a shape")

# Subclass named Circle inheriting from Shape
class Circle(Shape):
    # Method overriding
    def draw(self):
        print("Drawing a circle")

    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * (self.radius * self.radius)

# Create an object of the Square class
class Square(Shape):
    def draw(self):
        print("Drawing a square")

    def __init__(self, length):
        self.length = length

    def area(self):
            return self.length * self.length

# Create an object of the Rectangle class
class Rectangle(Shape):
    def draw(self):
        print("Drawing a rectangle")

    def __init__(self, length, width):
        self.length = length
        self.width = width

    def area(self):
        return self.length * self.width

# Creating objects and calling them with arguments
rectangle = Rectangle(3, 4)
rectangle.draw()
print("The area of the rectangle is", rectangle.area())

Circle = Circle(3)
Circle.draw()
print("The area of the circle is", Circle.area())

Square = Square(7)
Square.draw()
print("The area of the square is", Square.area())

