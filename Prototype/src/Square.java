import java.util.ArrayList;

class Square extends Figure {


    Square(int Ax, int Ay, int Bx, int By, int Cx, int Cy, int Dx, int Dy) throws Exception{

        if(checkIfSquare(Ax, Ay, Bx, By, Cx, Cy, Dx, Dy)){
            listOFPoints.add(new Point(Ax, Ay,'a'));
            listOFPoints.add(new Point(Bx, By,'b'));
            listOFPoints.add(new Point(Cx, Cy,'c'));
            listOFPoints.add(new Point(Dx, Dy,'e'));
        }
        else{
            throw new Exception("This is not a Square");
        }


    }
    private boolean checkIfSquare(int Ax, int Ay, int Bx, int By, int Cx, int Cy, int Dx, int Dy){
        if(distance(Ax,Ay,Bx,By) == distance(Ax,Ay,Cx,Cy)){
            if(distance(Ax,Ay,Bx,By) == distance(Dx,Dy,Cx,Cy)){
                if(distance(Ax,Ay,Bx,By) == distance(Dx,Dy,Bx,By)){
                    return distance(Ax, Ay, Dx, Dy) == distance(Bx, By, Cx, Cy);
                }
            }
        }
        return false;

    }

    private double distance(int Ax, int Ay, int Bx, int By){
        return  Math.sqrt(((Ax-Bx)*(Ax-Bx) + (Ay-By)*(Ay-By)));
    }
}
