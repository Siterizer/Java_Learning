import java.util.ArrayList;

abstract class Figure implements Cloneable {
    ArrayList<Point> listOFPoints = new ArrayList<Point>();

    ArrayList<Point> getListOFPoints(){
        return listOFPoints;
    }
    @Override
    public Figure clone(){
        try{
            Figure temp = (Figure) super.clone();
            temp.listOFPoints = new ArrayList<>(listOFPoints);
            return temp;
        }
        catch(Exception ex){
            return null;
        }
    }
}
