package Factory;

public class Vector implements IMath {
    private Integer[] params;

    Vector(Object temp){
        this.params = (Integer[]) temp;
    }

    public Object getNumbers(){
        return getParams();
    }

    public Integer[] getParams(){
        return params;
    }
}
