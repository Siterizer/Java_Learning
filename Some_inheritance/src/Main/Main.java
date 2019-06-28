package Main;

import ThreeDim.*;
import TwoDim.*;

public class Main {
    public static void main(String [] args){
        Circle circle = new Circle(5.5);
        Square square = new Square(9.8);
        System.out.println("Area of the circle: " + circle.getArea() + " radius: " + circle.getR());
        System.out.println("Area of the square: " + square.getArea() + " side length: " + square.getD());
        Figure cube = new Cube(10);
        System.out.println("Area of the cube: " + cube.getArea() + "type: " + cube.getClass());
        Figure roller = new Roller(50, 280.11);
        System.out.println("Area of the roller: " + roller.getArea() + " type: " + roller.getClass());
    }
}
