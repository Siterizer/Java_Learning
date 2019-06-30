class Triangle extends Figure {
    Triangle(int Ax, int Ay, int Bx, int By, int Cx, int Cy) throws Exception{

        if(checkIfSquare(Ax, Ay, Bx, By, Cx, Cy)){
            listOFPoints.add(new Point(Ax, Ay,'a'));
            listOFPoints.add(new Point(Bx, By,'b'));
            listOFPoints.add(new Point(Cx, Cy,'c'));
        }
        else{
            throw new Exception("This is not a Triangle");
        }


    }
    private boolean checkIfSquare(int Ax, int Ay, int Bx, int By, int Cx, int Cy){
        double ab = distance(Ax, Ay, Bx, By);
        double bc = distance(Bx, By, Cx, Cy);
        double ca = distance(Cx, Cy, Ax, Ay);
        if(ab > bc + ca) return false;
        if(bc > ab + ca) return false;
        return !(ca > ab + bc);

    }

    private double distance(int Ax, int Ay, int Bx, int By){
        return  Math.sqrt(((Ax-Bx)*(Ax-Bx) + (Ay-By)*(Ay-By)));
    }
}
