package TwoDim;

import Enums.figureType;
import Main.Figure;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        super(Math.PI * r * r);
        this.type = figureType.twoD;
        this.r = r;
    }

    public double getR() {
        return this.r;
    }
}
