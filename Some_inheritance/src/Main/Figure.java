package Main;

import Enums.figureType;

public class Figure {
    private double area;
    protected figureType type;

    public double getArea() {
        return this.area;
    }

    public Figure(double area){
        this.area = area;
    }
}