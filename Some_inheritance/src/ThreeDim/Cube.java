package ThreeDim;

import Enums.figureType;
import Main.Figure;

public class Cube extends Figure {
    double r;

    public Cube(double r) {
        super((Math.PI * 4) * r * r);
        this.type = figureType.ThreeD;
    }

    double getR(){
        return this.r;
    }
}
