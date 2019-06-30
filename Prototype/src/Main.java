public class Main {
    public static void main(String[] args){

        Figure s;
        try {
            s = new Square(0, 0, 2, 0, 0, 2, 2, 2);
        FigureCopier squareCopier = new FigureCopier(s);
        Figure s1 = squareCopier.copyFigure();
        Figure s2 = squareCopier.copyFigure();
        s2.listOFPoints.add(0, new Point(2,2, 'a'));
        for(int i=0; i<4; i++){
            System.out.print( "s1:" + s1.getListOFPoints().get(i).getX() + " " + s1.getListOFPoints().get(i).getY() + "  s2:");
            System.out.println(s2.getListOFPoints().get(i).getX() + " " + s2.getListOFPoints().get(i).getY());
        }
        System.out.print("\n\n");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try{
        Figure t = new Triangle(0, 0, 40, 0, 40, 40);
        FigureCopier triangleCopier = new FigureCopier(t);
        Figure t1 = triangleCopier.copyFigure();
        Figure t2 = triangleCopier.copyFigure();
        t2.listOFPoints.add(0, new Point(5,5, 'a'));
        for(int i=0; i<3; i++){
            System.out.print( "t1:" + t1.getListOFPoints().get(i).getX() + " " + t1.getListOFPoints().get(i).getY() + "  t2:");
            System.out.println(t2.getListOFPoints().get(i).getX() + " " + t2.getListOFPoints().get(i).getY());
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
