package ThreeDim;

import Enums.figureType;
import Main.Figure;

public class Roller extends Figure {
    private double r;
    private double H;
    public Roller(double r, double H) {
        super(2 * Math.PI * r * (r + H));
        this.type = figureType.twoD;
        this.H = H;
        this.r = r;
    }

    public double getH() {
        return this.H;
    }

    public double getR() {
        return this.r;
    }
}
