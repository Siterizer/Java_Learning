package TwoDim;

import Enums.figureType;
import Main.Figure;

public class Square extends Figure {
    private double d;

    public Square(double d) {
        super(d*d);
        this.type = figureType.twoD;
        this.d = d;
    }

    public double getD() {
        return this.d;
    }
}
